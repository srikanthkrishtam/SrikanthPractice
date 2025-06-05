package com.srikanth.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class AcroFileWrite {

	public static String fillData(final String sourceTemplatePDFURL, final Hashtable<String, String> data,
			final String destinationPDFPath, String fName) throws IOException, DocumentException {
		InputStream sourceTemplatePDFUrlStream = null;
		PdfStamper stamper = null;
		PdfReader reader = null;
		AcroFields form = null;
		String sourceTemplatePDFURL1 = null;
		File f = null;
		File destinationFile = null;
		try {

			sourceTemplatePDFURL1 = sourceTemplatePDFURL;
			f = new File(sourceTemplatePDFURL1);
			sourceTemplatePDFUrlStream = new BufferedInputStream(new FileInputStream(f));
			
			String fileName = fName + ".pdf";
			destinationFile = new File(destinationPDFPath + File.separator + fileName);

			org.apache.commons.io.FileUtils.copyFile(f, destinationFile);
			reader = new PdfReader(sourceTemplatePDFUrlStream);
			stamper = new PdfStamper(reader, new FileOutputStream(destinationFile));
			//System.out.println("can write==" + new org.json.JSONArray(stamper.getAcroFields()) );

			form = stamper.getAcroFields();
			form.getFields().keySet();
			for (Map.Entry<String, String> entry : data.entrySet()) {
				
				System.out.println("key::"+entry.getKey()+"values::"+entry.getValue());
				form.setField(entry.getKey(), entry.getValue());
			}
			stamper.setFormFlattening(true);

			System.out.println("9090==="+stamper.getAcroFields().getFields().get("address"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null!=sourceTemplatePDFUrlStream) {
			sourceTemplatePDFUrlStream.close();
			}
			if(null!=reader) {
				reader.close();
			}
			if(null!=stamper) {
			stamper.close();
			}
		}
			
		return destinationPDFPath;
	}

	public static void main(String k[]) {

		Hashtable<String, String> data = new Hashtable<>();

		data.put("date", "2022-01-2");
		data.put("fullName", "srikanthk");
		data.put("amount", "13000");
		data.put("loanActNumber","989879798");//recordEmandate.getLoanSanction().getLoan_term()
		data.put("fullName1","srikanthk1");
		data.put("address","Hyderabad");
		data.put("zipCode","123");
		

		String sourceTemplatePDFURL = "D:\\Srikanth@1997\\PdfAcroFile\\Loan_Closure_Sourcee (1).pdf";
		String destFileName = "loanClouser";
		String destinationPDFPath = "D:\\Srikanth@1997\\PdfAcroFile\\";
  try {
		 String s=	fillData(sourceTemplatePDFURL, data, destinationPDFPath, destFileName);
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
