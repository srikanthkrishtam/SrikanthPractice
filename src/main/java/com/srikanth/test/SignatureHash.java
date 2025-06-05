package com.srikanth.test;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
public class SignatureHash {
	public static String generateHMAC(String clientSecret, String data) {
        String hash = null; //data is a string which has the json sorted through keys and concatenated values
        try {
            String secret = clientSecret;
            String message = data="{'payment':{'entity':{'id':'pay_G6sBwMhBqlheZx','entity':'payment','amount':0,'currency':'INR','status':'captured','order_id':'order_G6sAf4sGpwW5nh','invoice_id':'inv_G6sAf3eHprzfsR','international':false,'method':'emandate','amount_refunded':0,'refund_status':null,'captured':true,'description':'Invoice #inv_G6sAf3eHprzfsR','card_id':null,'bank':'ICIC','wallet':null,'vpa':null,'email':'krishna@qfund.net','contact':'+919948885014','customer_id':'cust_G6FT3zbPu0NW4i','token_id':'token_G6sBwRhrgPfDkR','notes':{'note_key_1':'11252','note_key_2':'#117076134'},'fee':944,'tax':144,'error_code':null,'error_description':null,'error_source':null,'error_step':null,'error_reason':null,'acquirer_data':{},'created_at':1606628671}},'order':{'entity':{'id':'order_G6sAf4sGpwW5nh','entity':'order','amount':0,'amount_paid':0,'amount_due':0,'currency':'INR','receipt':'141565648831750144','offer_id':null,'offers':{'entity':'collection','count':0,'items':[]},'status':'paid','attempts':1,'notes':[],'created_at':1606628598,'token':{'method':'emandate','notes':{'note_key_1':'11252','note_key_2':'#117076134'},'recurring_status':null,'failure_reason':null,'currency':'INR','max_amount':9999900,'auth_type':'netbanking','expire_at':1606800600,'bank_account':{'ifsc':'ICIC0000078','bank_name':'ICICI Bank','name':'Krishna','account_number':'XXXXXXXX9258','account_type':'savings','beneficiary_email':'krishna@qfund.net','beneficiary_mobile':'9948885014'},'first_payment_amount':0}}},'invoice':{'entity':{'id':'inv_G6sAf3eHprzfsR','entity':'invoice','receipt':'141565648831750144','invoice_number':'141565648831750144','customer_id':'cust_G6FT3zbPu0NW4i','customer_details':{'id':'cust_G6FT3zbPu0NW4i','name':'KRISHNA MANCHODU','email':'krishna@qfund.net','contact':'9948885014','gstin':null,'billing_address':null,'shipping_address':null,'customer_name':'KRISHNA MANCHODU','customer_email':'krishna@qfund.net','customer_contact':'9948885014'},'order_id':'order_G6sAf4sGpwW5nh','payment_id':'pay_G6sBwMhBqlheZx','status':'paid','expire_by':1606800600,'issued_at':1606628598,'paid_at':1606628673,'cancelled_at':null,'expired_at':null,'sms_status':null,'email_status':null,'date':1606628598,'terms':null,'partial_payment':false,'gross_amount':0,'tax_amount':0,'taxable_amount':0,'amount':0,'amount_paid':0,'amount_due':0,'first_payment_min_amount':null,'currency':'INR','currency_symbol':'\\u20b9','description':'vCard eMandate','notes':{'note_key_1':'11252','note_key_2':'#117076134'},'comment':null,'short_url':'https://rzp.io/i/ycaeSj0W5','view_less':true,'billing_start':null,'billing_end':null,'type':'link','group_taxes_discounts':false,'supply_state_code':null,'user_id':null,'created_at':1606628598,'idempotency_key':null,'auth_link_status':'paid'}}}";
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(),"HmacSHA256");
            sha256_HMAC.init(secret_key);
            hash = Base64.encodeBase64String(sha256_HMAC.doFinal(message.getBytes()));
        }
        catch (Exception e){ //Log it
        }
        return hash;
    }
	
	
	public static void main(String[] args) {
		System.out.println("SignatureHash.main()"+generateHMAC("EMNDT_STATUS_012",null));
}
}
