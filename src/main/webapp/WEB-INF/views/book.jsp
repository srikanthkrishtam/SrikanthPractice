<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
h2 {
	color: black;
	font-size: 90;
	padding: 9px;
}

body {
	/*   margin:0;
  padding:0; */ //
	font-family: sans-serif;
	background: lightblue;
}

table {
	height: 100%;
	width: 75%;
}
.updatePopUpClass{
background-color: white;
border: 5px solid;
width: 400px;
display:flex;




}
.rowswsw	{
    display: flex;
    flex-direction: column-reverse;
    flex-wrap: wrap;
    align-content: center;
}
</style>
<title>BookList</title>
</head>
<body>
 
<c:if test="${booksList.status eq 'success'}">
		<!-- <div class="rowswsw">
		  <strong>BookList Fetched successfully.</strong> 
		<div class="col-sm-8 col-sm-offset-2 alert alert-success">
		</div>
		</div> -->
		<div class="row">
		<div class="col-sm-8 col-sm-offset-2 alert alert-success">
		  <strong style="align=center">Doctor created successfully.</strong> 
		</div>
		</div>
	</c:if>



	<%-- <div align="center">
		<table border="1" cellpadding="10">
			<caption>
				<h2>List of Books</h2>
			</caption>
			<tr>
				<th>Button</th>
				<th>title</th>
				<th>name</th>
			</tr>
			<c:forEach var="booklist" items="${booksList}">
				<tr>
					

					<td><c:out value="${booklist.title}" /></td>
					<td><c:out value="${booklist.author.name}" /></td>
					<td><input type="button" class="btn btn-danger" id="CallId"
						align="center" vaign="middle" value="Update"
						onclick="saveRemarksAndDisposition('${booklist.id}')"></td>
				</tr>
			</c:forEach>
		</table>
	</div> --%>





	<div align="center">
		<c:if test="${booksList.status eq 'success'}">
			<c:if test="${booksList.bookList.size() eq 0}">
				<h4 align="center">No data Found.</h4>
			</c:if>
			<c:if test="${booksList.bookList.size() gt 0}">
				<div class="col-md-1"></div>
				<div class="col-md-10" id="tableDivId">
					<table border="1" cellpadding="10" id="bookListTableId">
						<h2 style="color: red">List of Books</h2>

						<thead>
							<tr style="color: #70587C">
								<th>title</th>
								<th>name</th>
								<th>Button</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="blist" items="${booksList.bookList}">
								<tr>
									<td>${blist.title}</td>
									<td>${blist.author.name}</td>


									<td><input type="button" class="btn btn-danger"
										id="CallId" align="center" vaign="middle" value="Update"
										onclick="saveOrUpdateBookDetailsById('${blist.id}')">

									</td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</c:if>

		</c:if>
		<c:if
			test="${booksList.status eq 'failure' || bookList.status eq null || booksList eq ''}">
			<h4 align="center">${booksList.message}</h4>
		</c:if>
	</div>

 
<div style="display:flex; justify-content: center;">
      <div class="updatePopUpClass" id="viewCallRecRemarksDataPopUp" role="dialog" style="display:none">
		<div class="modal-dialog">
			
				
	 
						<br/>
						<div class="col-sm-10 col-sm-offset-1 form-group curvedBlock" style=" display: flex;flex-direction: column; align-items: stretch;">
						
						<h4 align="center">Update Book <a  class="close" data-toggle="tooltip"
								data-original-title="Close" title="Close" data-dismiss="modal"	aria-hidden="true" style="padding-right: 12px;padding-top: 15px" onclick="closeViewPopUp()" >&times;</a></h4>
						
						<!-- <p>&nbsp;</p> -->
								<div class="row">
								<div class="col-md-12" id="" style="display: flex;justify-content: space-evenly;">
								<form action="${context}saveorupdateBookById" method="post" modelAttribute="BookRequest" id="saveCellHealth" style="display: flex;flex-direction: column;  align-items: flex-start;">
									<lable>BookName : </lable>
									<input type="text" id="remarks" value="" name="name" class="form-control" /><br>
									<label>Book Title :</label>
									
									<input type="text" id="remarks" value="" name="title" class="form-control" /><br>
									<input type="test" id="hidKey" value="" name="bookId">
									&nbsp;<input type="submit"  class="btn btn-danger" id="" align="center" vaign="middle" value="save" style="margin-left: 55px;" /><br>&nbsp;
								</form>
								</div>
								</div>       
           						</div>
				</div>
			</div> 
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript">
	
	 $(document).ready(function () {
	        $('#bookListTableId').DataTable();
	    });
	
	function closeViewPopUp(){
/* 		$("#viewCallRecRemarksDataPopUp").modal('hide');
 *  document.getElementById("bookListTableId").style.display ="flex";

 */
 
 document.getElementById("viewCallRecRemarksDataPopUp").style.display ="none";
 document.getElementById("tableDivId").style.display ="block";

	}
	
	
 function saveOrUpdateBookDetailsById(bookId){
    
    alert("bookId:::::"+bookId);	
    
    
    document.getElementById("tableDivId").style.display ="none";

    document.getElementById("viewCallRecRemarksDataPopUp").style.display ="block";

/* $("#viewCallRecRemarksDataPopUp").css("display", "block");
 */alert("uigiuo"+bookId);
				document.getElementById("hidKey").value = bookId;
				//  document.getElementById("hidKey").innerHTML = bookId;

			}

</script>

</body>


</html>