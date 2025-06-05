/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

(function($, W, D) {
	var JQUERY4U = {};

	JQUERY4U.UTIL = {
		setupFormValidation : function() {
			
			/*jQuery.validator.addMethod("numberwithdigit", function (value, element) {
		        return this.optional(element) || /^\d{0,2}(\.\d{0,10})?$/i.test(value);
		    }, "You must include two decimal places");
			
			$("#wastageDetails").validate({
				rules : {
					hospId :"required",
				},
				infectoinWaste: {
					 numberwithdigit: true
		            },
				messages : {
					hospId : "Select Hospital. ",
					infectoinWaste: "Only Numbers.",
					
				},
				submitHandler : function(form) {
					form.submit();
				}
			});*/
			
			$("#doctorDet").validate({
				rules : {
					fromDate :{
						required:function(element) {
							 return  $("#toDate").val().length>0;
					      }
					},
				},
				messages : {
					fromDate : "Please enter fromDate. ",
					
				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			
			
			/*$("#userSearch").validate({
				rules : {
					fromDate : "required",
					toDate : "required",
					name :{
	               		letterswithspace:true
	               	},
					phoneNo : {
						minlength : 10,
						maxlength : 10,
						number : true
					},
					status : "required"
						
				},
				messages : {

					fromDate : "Please enter From Date",
					toDate : "Please enter To Date",
					name :{
	               		letterswithspace: "Please enter alphabets"
	               		},
					phoneNo :{
						minlength : "Phone number must be 10 digits",
						maxlength:"Phone number must be 10 digits",
                  		 number:"Only numbers are allowed"
					},
					status : "Please select Status",

				},
				submitHandler : function(form) {
					form.submit();
				}
			});*/
			
			$("#pwdReset").validate({
				rules : {
					newPassword : "required",
					conNewPassword : {
						required : true,
						equalTo : "#newPassword"
					}
				},
				messages : {
					newPassword : "Please enter Password",
					conNewPassword : {
						required : "Please enter Confirm Password",
						equalTo : " Password does not match "
					}
				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			$("#viewAmbulanceRequest").validate({
                rulesviewAmbulanceRequest: {
                	ambulanceKey:{
               		 required:true, 
               		 
               	 }
                },
                messages: {
                	
                	ambulanceKey:{
                		required :"Please Select Ambulance Provider",
               		 
               	 }
                },
                submitHandler: function(form) {
                	 form.submit();
                }
            });

			$("#loginVal").validate({
				rules : {
					userId : "required",
					password : "required"

				},
				messages : {

					userId : "Please enter User ID",
					password : "Please enter Password"

				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			
			$("#registerNewUser").validate({
				rules : {
					fullName : "required",
					emailId  : "required",
					pwd : "required",
					phoneNum : "required"

				},
				messages : {

					fullName : "Please enter Full Name.",
					emailId  : "Please enter EmailId.",
					pwd : "Please enter Password",
					phoneNum : "Please enter Phone Number."

				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			$("#partnerLoginVal").validate({
				rules : {
					userId : "required",
					password : "required"

				},
				messages : {

					userId : "Please enter User ID",
					password : "Please enter Password"

				},
				/*submitHandler : function(form) {
					form.submit();
				}*/
			});

			
			
			$("#callRecord").validate({

				rules : {

					callerName : {
						required : true,
						letterswithspace:true 
					},
					patientMrn : {
						required : false,
					},

					agentName : {
						required : true,
						letterswithspace:true
					},
					callDate : "required",
					typeOfCall : {
						required : true,
					},
					categoryOfCall : {
						required : true,
					},
					purposeOfCall : "required",
					mobileNumber : {
						required : true,
						minlength : 10,
						maxlength : 10,
						number : true
					},

					agentRemarks : "required",
					optionName : {
						required : true,
					},

				},
				messages : {

					callerName : {

						required : "Please enter Caller Name.",
						letterswithspace : "Alphabets only  Allowed"
					},

					/*patientMrn : {
						required : "Please enter patient MRN.",
					},*/
					agentName : {
						required : "Please enter a  Agent name.",
						letterswithspace : "Alphabets only  Allowed"

					},
					callDate : "Please enter call date.",
					typeOfCall : {
						required : "Please select call type.",

					},
					categoryOfCall : {
						required : "Please select call category.",
					},
					purposeOfCall : "Please enter purpose of call.",
					mobileNumber : {
						required : "Please enter Phone Number ",
						minlength : "Number should be 10 Digits.",
						maxlength : "Number should be 10 Digits.",
						number : "Number Should be Numbers."
					},
					agentRemarks : "Please enter agent remarks. ",
					optionName : {
						required : "Please select Call DisPosition type.",

					},

				},
				submitHandler : function(form) {

					form.submit();
				}
			});
			$("#callRecordSearch").validate({
				rules : {
					fromDate : {
						required : true,
					},
					toDate : {
						required : true,
					},
					agentName : {
						required : true,
					}
				},
				
				messages : {
					fromDate : {
						required : "Please select  fromDate.",
					},
					
					toDate : {
						required : "Please select toDate.",
					},
					agentName : {
						required : "Please select the agent name.",
					}
				
				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			
			$("#campDetails").validate({
				rules : {
					fromDate : {
						required : true,
					},
					toDate : {
						required : true,
					},
					
					campName : {
						required : true,
					},
				},
				messages : {
					fromDate : {
						required : "Please select  fromDate.",
					},
					
					toDate : {
						required : "Please select toDate.",
					},
					
					campName : {
						required : "Please select  campName.",
					},
				},
				submitHandler : function(form) {
					form.submit();
				}
			});
				
			//update Patient Remarks
			
			
		/*	
			$("#updateRemarks").validate({
				rules : {
								
					remark : {
						required : true,
						minlength : 2,
						maxlength : 250,
						lettersonly : true,
					},
				},
				messages : {
					remark : {
						required : "Please enter Remarks",
						maxlength : "remarks should be 250 characters" ,
						lettersonly : "Alphabets only  Allowed"
					},
				},
				submitHandler : function(form) {
					form.submit();
				}
			});
				*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			$("#callRecordRemarksSearch").validate({
				rules : {
					agentRemarks : "required",
				},
				
				messages : {
					agentRemarks : "Please enter agent remarks. ",
				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			
			
			$("#viewCallRecordRemarksHistory").validate({
				rules : {
					agentRemarks :"required",
					
				},
				messages : {
					agentRemarks : "Please enter agent remarks. ",
					
				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			
			
			
			$("#adminEditVal").validate({

				rules : {

					firstName : {
						required : true,
						lettersonly : true
					},
					lastName : {
						required : true,
						lettersonly : true

					},

					email : {
						required : true,
						email : true
					},
					addr1 : "required",
					postalCode : {
						required : true,
						minlength : 6,
						maxlength : 6,
						number : true
					},
					city : {
						required : true,
						letterswithspace : true
					},
					country : "required",

					cellNo : {
						required : true,
						minlength : 10,
						maxlength : 10,
						number : true
					},

					state : "required",

				},
				messages : {

					firstName : {

						required : "Please enter Admin First Name.",
						lettersonly : "Alphabets only  Allowed"
					},

					lastName : {
						required : "Please enter Admin Last Name.",
						lettersonly : "Alphabets only  Allowed"
					},
					email : {
						required : "Please enter a  Email Address.",
						email : "Please enter a valid Email Address."

					},
					addr1 : "Please enter Address.",
					postalCode : {
						required : "Please enter Postal Code.",
						minlength : "Postal Code should be 6 Digits.",
						number : "Postal Code Should be Numbers."

					},
					city : {
						required : "Please enter Name of the City.",
						letterswithspace : "Alphabets only  Allowed"
					},
					country : "Please Select Country Name.",
					state : "Please Select State Name. ",
					cellNo : {
						required : "Please enter Cell Phone Number ",
						minlength : "Cell Phone Number should be 10 Digits.",
						maxlength : "Cell Phone Number should be 10 Digits.",
						number : "Cell Phone Number Should be Numbers."
					},

				},
				submitHandler : function(form) {

					form.submit();
				}
			});
			/*$("#doctorBasicDetails")
			.validate(
					{
						rules : {

							firstName : {
								required : true,
							},
							emailId : {
								email : true,
								
							},
							
							phoneNumber : {
								required : true,
								number : true
							},
							
							
						},
						messages : {

							firstName : {
								required : "Please Enter Name",
							},
							emailId : {
								email : "Please Enter a valid Email Address."
								
							},	

							
							phoneNumber : {
								required :"Please Enter the Phone number.",
								minlength : " Phone Number should be 10 Digits.",
								maxlength : " Phone Number should be 10 Digits.",
								number : " Phone Number Should be Numbers."
							},
							
							
					
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});*/
			$("#achieveTab")
			.validate(
					{
						rules : {

							acheivementName : {
								required : true,
							},
							description : {
								required : true,
								
							},
							
						},
						messages : {

							acheivementName : {
								required : "Please Enter Achievement Name",
							},
							description : {
								required : "Please Enter Description."
								
							},	

					
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
			$("#awardsTab")
			.validate(
					{
						rules : {

							awardName : {
								required : true,
							},
							
						},
						messages : {

							awardName : {
								required : "Please Enter Award Name",
							},

					
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
			
			$("#doctorBasicDetails")
			.validate(
					{
						rules : {

							firstName : {
								required : true,
								letterswithspace : true,
							},
							middleName : {
								letterswithspace : true,
							},
							lastName : {
								required : true,
								letterswithspace : true,
							},
							education :{
								required : true,
								letterssplchar :true,
							},
							aboutDoctor :{
								required : true,
								letterssplchar :true,
							},
							spDbKeys :{
								required : true,
							},
							emailId : {
								required: true,
								email : true,
								
							},
							doctorCode : {
								required : true,
								alphanumeric : true,
								
							},
							userId : {
								required : true,
								alphanumeric : true,
							},
							
							phoneNumber : {
								required : true,
								minlength : 10,
								maxlength : 10,
								number : true,
							},
							experience :{
								required : true,
								number : true,
								minlength : 1,
								maxlength : 2,
							},
							
						},
						messages : {

							firstName : {
								required : "Please Enter First Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							middleName : {
								letterswithspace : "Alphabets only  Allowed"
							},
							lastName : {
								required : "Please Enter Last Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							education : {
								required : "Please Enter Education",
								letterssplchar:"Alphabets and Special Charaters(-.&,()') only Allowed.",
							},
							aboutDoctor :{
								required : "Please Enter Designation",
								letterssplchar:"Alphabets and Special Charaters(-.&,()') only Allowed.",
							},
							spDbKeys : {
								required : "Please Select Department",
							},
							emailId : {
							required :"Please Enter Email Id",
							email : "Please Enter a valid Email Address."
							
						},	
						doctorCode : {
							required : "Please Enter Doctor Code",
							alphanumeric:"Alphabets and Numerics only Allowed",
							
						},
						userId : {
							required : "Please Enter Doctor Id",
							alphanumeric:"Alphabets and Numerics only Allowed",
						},
						phoneNumber : {
							required :"Please Enter the Phone number.",
							minlength : " Phone Number should be 10 Digits.",
							maxlength : " Phone Number should be 10 Digits.",
							number : " Phone Number Should be Numbers."
						},
						experience : {
							required:"Please Enter the Experience.",
							number : " Experience Should be Numbers.",
							minlength : " experience should be 1 Digit.",
							maxlength : " experience should be 2 Digits.",
						},

					
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
			
			/*$("#addNewDoctorForm")
			.validate(
					{
						rules : {

							firstName : {
								required : true,
								letterswithspace : true,
							},
							middleName : {
								letterswithspace : true,
							},
							lastName : {
								required : true,
								letterswithspace : true,
							},
							gender :{
								required : true,
							},
							education :{
								required : true,
								letterssplchar :true,
							},
							aboutDoctor :{
								required : true,
								letterssplchar :true,
							},
							spDbKeys :{
								required : true,
							},
							emailId : {
								required: true,
								email : true,
								
							},
							qualification : {
								required: true,
							},
							registrationNo : {
								required: true,
							},
							designation : {
								required: true,
							},
							doctorGrade :{
								required : true,
							},
							doctorType :{
								required : true,
							},
							doctorCategory :{
								required : true,
							},
							doctorCode : {
								required : true,
								alphanumeric : true,
								
							},
							userId : {
								required : true,
								alphanumeric : true,
							},
							
							phoneNumber : {
								required : true,
								minlength : 10,
								maxlength : 10,
								number : true,
							},
							experience :{
								required : true,
								number : true,
								minlength : 1,
								maxlength : 2,
							},
							
						},
						messages : {
							firstName : {
								required : "Please Enter First Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							middleName : {
								letterswithspace : "Alphabets only  Allowed"
							},
							lastName : {
								required : "Please Enter Last Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							gender :{
								required : "Please Select gender."
							},
							education : {
								required : "Please Enter Education",
								letterssplchar:"Alphabets and Special Charaters(-.&,()') only Allowed.",
							},
							aboutDoctor :{
								required : "Please Enter Designation",
								letterssplchar:"Alphabets and Special Charaters(-.&,()') only Allowed.",
							},
							spDbKeys : {
								required : "Please Select Department",
							},
							emailId : {
							required :"Please Enter Email Id",
							email : "Please Enter a valid Email Address."
							
						},	
						qualification : {
							required :"Please Enter qualification."
						},
						registrationNo : {
							required :"Please Enter registrationNo."
						},
						designation : {
							required :"Please Enter designation."
						},
						doctorGrade : {
							required : "Please Select doctor grade."
						},
						doctorType : {
							required : "Please Select doctor type."
						},
						doctorCategory : {
							required : "Please Select doctor category."
						},
						doctorCode : {
							required : "Please Enter Doctor Code",
							alphanumeric:"Alphabets and Numerics only Allowed",
							
						},
						userId : {
							required : "Please Enter Doctor Id",
							alphanumeric:"Alphabets and Numerics only Allowed",
						},
						phoneNumber : {
							required :"Please Enter the Phone number.",
							minlength : " Phone Number should be 10 Digits.",
							maxlength : " Phone Number should be 10 Digits.",
							number : " Phone Number Should be Numbers."
						},
						experience : {
							required :"Please enter Experience.",
							number : " Experience Should be Numbers.",
							minlength : " experience should be 1 Digit.",
							maxlength : " experience should be 2 Digits.",
						},
							

					
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});*/
			
			
			$("#updateNewDoctorForm")
			.validate(
					{
						rules : {

							firstName : {
								required : true,
								letterswithspace : true,
							},
							lastName : {
								required : true,
								letterswithspace : true,
							},
							'doctorOnboard.gender' :{
								required : true,
							},
							phoneNumber : {
								required : true,
								minlength : 10,
								maxlength : 10,
								number : true,
							},
							emailId : {
								required: true,
								email : true,
								
							},
							qualification : {
								required: true,
							},
							'doctorOnboard.registrationNo' : {
								required: true,
							},
							designation : {
								required: true,
							},
							'doctorOnboard.docGradeDbKey' :{
								required : true,
							},
							'doctorOnboard.docTypeDbKey' :{
								required : true,
							},
							'doctorOnboard.docCatDbKey' :{
								required : true,
							},
							spDbKey :{
								required : true,
							},
							'doctorOnboard.workType' :{
								required : true,
							},
							pay :{
								required : true,
							},
						},
						messages : {
							firstName : {
								required : "Please Enter First Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							lastName : {
								required : "Please Enter Last Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							'doctorOnboard.gender' :{
								required : "Please select gender."
							},
							phoneNumber : {
								required :"Please Enter the Phone number.",
								minlength : " Phone Number should be 10 Digits.",
								maxlength : " Phone Number should be 10 Digits.",
								number : " Phone Number Should be Numbers."
							},
							emailId : {
								required :"Please Enter Email Id",
								email : "Please Enter a valid Email Address."
								
							},
							qualification : {
								required :"Please Enter qualification."
							},
							'doctorOnboard.registrationNo' : {
								required :"Please Enter registrationNo."
							},
							designation : {
								required :"Please Enter designation."
							},
							'doctorOnboard.docGradeDbKey' : {
								required : "Please Select doctor grade."
							},
							'doctorOnboard.docTypeDbKey' : {
								required : "Please Select doctor type."
							},
							'doctorOnboard.docCatDbKey' : {
								required : "Please Select doctor category."
							},
							'doctorOnboard.workType' : {
								required :"Please Select employeeMentType."
							},
							pay : {
								required :"Please Select pay."
							},
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
			
			
			$("#addNewDoctorForm")
			.validate(
					{
						rules : {

							firstName : {
								required : true,
								letterswithspace : true,
							},
							lastName : {
								required : true,
								letterswithspace : true,
							},
							'doctorOnboard.gender' :{
								required : true,
							},
							phoneNumber : {
								required : true,
								minlength : 10,
								maxlength : 10,
								number : true,
							},
							emailId : {
								required: true,
								email : true,
								
							},
							qualification : {
								required: true,
							},
							'doctorOnboard.registrationNo' : {
								required: true,
							},
							designation : {
								required: true,
							},
							'doctorOnboard.docGradeDbKey' :{
								required : true,
							},
							'doctorOnboard.docTypeDbKey' :{
								required : true,
							},
							'doctorOnboard.docCatDbKey' :{
								required : true,
							},
							spDbKey :{
								required : true,
							},
							'doctorOnboard.workType' :{
								required : true,
							},
							pay :{
								required : true,
							},
							'captureUserDetails.level' :{
								required : true,
							},
							'captureUserDetails.title' :{
								required : true,
							},
							'captureUserDetails.nation' :{
								required : true,
							},
							'captureUserDetails.motherTongue' :{
								required : true,
							},
							'captureUserDetails.maritalStatus' :{
								required : true,
							},
							'captureUserDetails.skill' :{
								required : true,
							},
							'captureUserDetails.address' :{
								required : true,
							},
							'captureUserDetails.empCode' :{
								required : true,
								alphanumeric : true,
							},
						},
						messages : {
							firstName : {
								required : "Please Enter First Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							lastName : {
								required : "Please Enter Last Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							'doctorOnboard.gender' :{
								required : "Please select gender."
							},
							phoneNumber : {
								required :"Please Enter the Phone number.",
								minlength : " Phone Number should be 10 Digits.",
								maxlength : " Phone Number should be 10 Digits.",
								number : " Phone Number Should be Numbers."
							},
							emailId : {
								required :"Please Enter Email Id",
								email : "Please Enter a valid Email Address."
								
							},
							qualification : {
								required :"Please Enter qualification."
							},
							'doctorOnboard.registrationNo' : {
								required :"Please Enter registrationNo."
							},
							designation : {
								required :"Please Enter designation."
							},
							'doctorOnboard.docGradeDbKey' : {
								required : "Please Select doctor grade."
							},
							'doctorOnboard.docTypeDbKey' : {
								required : "Please Select doctor type."
							},
							'doctorOnboard.docCatDbKey' : {
								required : "Please Select doctor category."
							},
							'doctorOnboard.workType' : {
								required :"Please Select employeeMentType."
							},
							pay : {
								required :"Please Select pay."
							},
							'captureUserDetails.level' :{
								required : "Please Select level.",
							},
							'captureUserDetails.bloodGroup' :{
								required : "Please Select bloodgroup.",
							},
							'captureUserDetails.nation' :{
								required : "Please Select nation.",
							},
							'captureUserDetails.motherTongue' :{
								required : "Please Select motherTongue.",
							},
							'captureUserDetails.maritalStatus' :{
								required : "Please Select maritalStatus.",
							},
							'captureUserDetails.skill' :{
								required : "Please Select skills.",
							},
							'captureUserDetails.address' :{
								required : "Please enter address.",
							},
							'captureUserDetails.empCode' :{
								required : "Please enter empcode.",
								alphanumeric : "Alphabets and Numerics only Allowed.",
							},
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
			
			//
			$("#insertOfferForm").validate({
				rules : {
					title : "required",
					description  : "required",
					validFrom : "required",
					validTo : "required"

				},
				messages : {

					title : "Please enter Offer Title.",
					description  : "Please enter Offer description.",
					validFrom : "Please enter Offer valid from date",
					validTo : "Please enter Offer valid to date."

				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			$("#updateOfferForm").validate({
				rules : {
					/*title : "required",*/
					description  : "required",
					/*validFrom : "required",*/
					validTo : "required"

				},
				messages : {

					/*title : "Please enter Offer Title.",*/
					description  : "Please enter Offer description.",
					/*validFrom : "Please enter valid from date",*/
					validTo : "Please enter Offer valid to date."

				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			
			//Doctor onboard save
			
			$("#doctorDetailsId").validate({
				rules : {
					businessCardFullName : {
						required:true
					},
					businessCardQualification  : {
						required:true
					},
					businessCardDepartment : {
						required:true
					},
					businessCardDesignation : {
						required:true
					},
					businessCardOfficialEmail : {
						required: true,
						email : true,
					},
					businessCardContactNo : {
						required : true,
						minlength : 10,
						maxlength : 10,
						number : true,
					},
					labCoatSize: {
						required:true
					},
					officialEmailId: {
						required:true,
						email : true,
					},
					vhealthIdAndTraining: {
						required:true
					},
					imageBytes : {
						extension: "pdf|doc|docx"
					}
				},
				messages : {

					businessCardFullName : {
						required:"Enter BusinessCard FullName."
					},
					businessCardQualification  :{
						required:"Enter businessCard Qualification.",
					},
					businessCardDepartment :{
						required:"Enter businessCard department",
					},
					businessCardDesignation :{
						required:"Enter businessCard designation.",
					},
					businessCardOfficialEmail : {
						required :"Please Enter Email Id",
						email : "Please Enter a valid Email Address."
					},
					businessCardContactNo : {
						required :"Please Enter the Phone number.",
						minlength : " Phone Number should be 10 Digits.",
						maxlength : " Phone Number should be 10 Digits.",
						number : " Phone Number Should be Numbers."
					},
					labCoatSize:{
						required :"Please Enter labcoat size."
					},
					officialEmailId : {
						required :"Please Enter email id.",
						email : "Please Enter a valid Email Address."
					},
					vhealthIdAndTraining : {
						required :"Please Enter vhealthId and training."
					},
					imageBytes: {
						extension:"please select valid format."
					},

				},
				submitHandler : function(form) {
					form.submit();
				}
			});
			
			//add new employee validation
			
			$("#addNewEmployeeForm")
			.validate(
					{
						rules : {

							firstName : {
								required : true,
								letterswithspace : true,
							},
							lastName : {
								required : true,
								letterswithspace : true,
							},
							gender :{
								required : true,
							},
							phoneNumber : {
								required : true,
								minlength : 10,
								maxlength : 10,
								number : true,
							},
							emailId : {
								email : true,
								
							},
							location : {
								required: true,
							},
							skills : {
								required: true,
							},
							designation : {
								required: true,
							},
							qualification : {
								required: true,
							},
							accountType : {
								required: true,
							},
							accountName :{
								required : true,
							},
							workType :{
								required : true,
							},
							reasonForRequest :{
								required : true,
							},
							currentCtc :{
								required : true,
							},
							offeredCtc :{
								required : true,
							},
							lengthOfAgreement :{
								required : true,
							},
							interviewRemarks :{
								required : true,
							},
							typeOfApproval :{
								required : true,
							},
							sendApprovalTo :{
								required : true,
							},
							fileUploads : {
								extension: "pdf|doc|docx|jpg|jpeg|png"
							}
						},
						messages : {
							firstName : {
								required : "Please Enter First Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							lastName : {
								required : "Please Enter Last Name",
								letterswithspace : "Alphabets only  Allowed"
							},
							gender :{
								required : "Please select gender."
							},
							phoneNumber : {
								required :"Please Enter the Phone number.",
								minlength : " Phone Number should be 10 Digits.",
								maxlength : " Phone Number should be 10 Digits.",
								number : " Phone Number Should be Numbers."
							},
							emailId : {
								email : "Please Enter a valid Email Address."
								
							},
							location : {
								required : "Please select location."
							},
							skills : {
								required : "Please select skill."
							},
							designation : {
								required :"Please select designation."
							},
							qualification : {
								required :"Please select qualification."
							},
							accountType : {
								required :"Please select accountType."
							},
							accountName : {
								required :"Please select accountName."
							},
							workType : {
								required : "Please select workType."
							},
							reasonForRequest : {
								required : "Please Select ReasonForRequest."
							},
							currentCtc : {
								required : "Please enter currentCtc."
							},
							offeredCtc : {
								required :"Please enter offeredCtc."
							},
							lengthOfAgreement :{
								required : "Please enter lengthOfAgreement.",
							},
							interviewRemarks :{
								required : "Please enter interviewRemarks.",
							},
							typeOfApproval :{
								required : "Please Select typeOfApproval.",
							},
							sendApprovalTo :{
								required : "Please Select sendApprovalTo.",
							},
							fileUploads: {
								extension:"please select valid format."
							},
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
		
			
			$("#addNewAmbulanceRequestForm")
			.validate(
					{
						rules : {

							requesterName : {
								required : true,
								letterswithspace : true,
							},
							requesterNumber : {
								required : true,
								minlength : 10,
								maxlength : 10,
								number : true,
							},
							requesterEmail : {
								required: false,
								email : true,
							},
							requesterAddress : {
								required: true,
							},
							
						},
						messages : {
							requesterName : {
								required : "Please enter requester Name.",
								letterswithspace : "Alphabets only  Allowed"
							},
							requesterNumber : {
								required :"Please Enter the Phone number.",
								minlength : " Phone Number should be 10 Digits.",
								maxlength : " Phone Number should be 10 Digits.",
								number : " Phone Number Should be Numbers."
							},
							requesterEmail : {
								required :"Please Enter Email Id",
								email : "Please Enter a valid Email Address."
								
							},
							requesterAddress : {
								required :"Please Enter qualification."
							},
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
					
			$("#addNewDoctorPaymentForm")
			.validate(
					{
						rules : {
							userPaymentsTypesDbKey:{
									required : true,
								},
								doctorName : {
									required : true,
								},
								fixedPayNonCovid : {
									required: false,
									number : true,
								},
								opConsNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								ipConsNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								opInvesNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								ipInvesNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								insuranceCasesNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								corporateCasesNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								ipDirectCashNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								referralCasesNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								surgeonFeeNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								cabgNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								eBusNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								bronchoscopyNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								insuranceReferralNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								corporateReferralNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								proceduresNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								fixedPayCovid : {
									required: false,
									number : true,
								},
								opConsCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								ipConsCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								opInvesCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								ipInvesCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								insuranceCasesCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								corporateCasesCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								ipDirectCashCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralCasesCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								surgeonFeeCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								cabgCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								eBusCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								bronchoscopyCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								insuranceReferralCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								corporateReferralCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								proceduresCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								
								referralOpProceduresCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpProceduresNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralCashCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralCashNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpConsultationCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpConsultationNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpInvestigationsCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpInvestigationsNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								
								paymentsRemarksDbKey : {
									required: true,
								},
								hospDbKey : {
								required : true,
								},
								bdUserName : {
									required: false,
								},
								rmUserName : {
								required : false,
								},
								
							},
							messages : {
								userPaymentsTypesDbKey : {
									required : "Please select either Doctor or Refferal"
								},
								doctorName : {
									required : "Please select the Doctor"
								},
								fixedPayNonCovid : {
									required :"Please Enter the FixedPayNonCovid value.",
									number : " FixedPayNonCovid value Should be Numbers only.",
								},
								opConsNonCovid : {
									required :"Please Enter the OP Consultation value.",
									number : "OP Consultation value Should be Numbers only.",
									max : "OP Consultation value should not exceed 100 % "
									
								},
								ipConsNonCovid : {
									required :"Please Enter the IP Cross Consultation value.",
									number : " IP Cross Consultation value Should be Numbers only.",
									max : "IP Cross Consultation value should not exceed 100 % "
								},
								opInvesNonCovid : {
									required :"Please Enter the OP Investigation value.",
									number : "OP Investigation value Should be Numbers only.",
									max : "OP Investigation value should not exceed 100 % "
								},
								ipInvesNonCovid : {
									required :"Please Enter the ipInvesNonCovid value.",
									number : " ipInvesNonCovid value Should be Numbers only.",
									max : "ipInvesNonCovid value should not exceed 100 % "
								},
								insuranceCasesNonCovid : {
									required :"Please Enter the IP Own Insurance value.",
									number : "IP Own Insurance value Should be Numbers only.",
									max : "IP Own Insurance value should not exceed 100 % "
								},
								corporateCasesNonCovid : {
									required :"Please Enter the IP Own Corporate value.",
									number : "IP Own Corporate value Should be Numbers only.",
									max : "IP Own Corporate value should not exceed 100 % ",
								},
								ipDirectCashNonCovid : {
									required :"Please Enter the IP Own Cash value.",
									number : "IP Own Cash value Should be Numbers only.",
									max : "IP Own Cash value should not exceed 100 % ",
								},
								referralCasesNonCovid : {
									required :"Please Enter the referralCasesNonCovid value.",
									number : " referralCasesNonCovid value Should be Numbers only.",
									max : "referralCasesNonCovid value should not exceed 100 % ",
								},
								
								 surgeonFeeNonCovid : {
										required :"Please Enter the IP Cross Surgery value.",
										number : " IP Cross Surgery value Should be Numbers only.",
										max : "IP Cross Surgery value should not exceed 100 % ",
									},
									cabgNonCovid : {
										required :"Please Enter the cabgNonCovid value.",
										number : " cabgNonCovid value Should be Numbers only.",
										max : "cabgNonCovid value should not exceed 100 % ",
									},
									eBusNonCovid : {
										required :"Please Enter the cabgNonCovid value.",
										number : " cabgNonCovid value Should be Numbers only.",
										max : "cabgNonCovid value should not exceed 100 % ",
									},
									bronchoscopyNonCovid : {
										required :"Please Enter the bronchoscopyNonCovid value.",
										number : " bronchoscopyNonCovid value Should be Numbers only.",
										max : "bronchoscopyNonCovid value should not exceed 100 % ",
									},
								insuranceReferralNonCovid : {
									required :"Please Enter the IP Referral Insurance value.",
									number : "IP Referral Insurance value Should be Numbers only.",
									max : "IP Referral Insurance value should not exceed 100 % ",
								},
								corporateReferralNonCovid : {
									required :"Please Enter the IP Referral Corporate value.",
									number : "IP Referral Corporate value Should be Numbers only.",
									max : "IP Referral Corporate value should not exceed 100 % ",
								},
								proceduresNonCovid : {
									required :"Please Enter the OP Procedures value.",
									number : "OP Procedures value Should be Numbers only.",
									max : "OP Procedures value should not exceed 100 % ",
								},
								fixedPayCovid : {
									required :"Please Enter the FixedPayCovid value.",
									number : " FixedPayCovid value Should be Numbers only.",
								},
								opConsCovid : {
									required :"Please Enter the OP Consultation value.",
									number : "OP Consultation value Should be Numbers only.",
									max : "OP Consultation value should not exceed 100 % "
								},
								ipConsCovid : {
									required :"Please Enter the IP Cross Consultation value.",
									number : "IP Cross Consultation value Should be Numbers only.",
									max : "IP Cross Consultation value should not exceed 100 % "
								},
								opInvesCovid : {
									required :"Please Enter the OP Investigation value.",
									number : "OP Investigation value Should be Numbers only.",
									max : "OP Investigation value should not exceed 100 % "
								},
								ipInvesCovid : {
									required :"Please Enter the ipInvesCovid value.",
									number : " ipInvesCovid value Should be Numbers only.",
									max : "ipInvesCovid value should not exceed 100 % "
								},
								insuranceCasesCovid : {
									required :"Please Enter the IP Own Insurance value.",
									number : "IP Own Insurance value Should be Numbers only.",
									max : "IP Own Insurance value should not exceed 100 % "
								},
								corporateCasesCovid : {
									required :"Please Enter the IP Own Corporate value.",
									number : "IP Own Corporate value Should be Numbers only.",
									max : "IP Own Corporate value should not exceed 100 % "
								},
								ipDirectCashCovid : {
									required :"Please Enter the IP Own Cash value.",
									number : "IP Own Cash value Should be Numbers only.",
									max : "IP Own Cash value should not exceed 100 % "
								},
								referralCasesCovid : {
									required : "Please Enter the referralCasesCovid value.",
									number : "referralCasesCovid value Should be Numbers only.",
									max : "referralCasesCovid value should not exceed 100 % "
								},
								 surgeonFeeCovid : {
										required :"Please Enter the IP Cross Surgery value.",
										number : " IP Cross Surgery value Should be Numbers only.",
										max : "IP Cross Surgery value should not exceed 100 % ",
									},
									cabgCovid : {
										required :"Please Enter the cabgCovid value.",
										number : " cabgCovid value Should be Numbers only.",
										max : "cabgCovid value should not exceed 100 % ",
									},
									eBusCovid : {
										required :"Please Enter the eBusCovid value.",
										number : " eBusCovid value Should be Numbers only.",
										max : "eBusCovid value should not exceed 100 % ",
									},
									bronchoscopyCovid : {
										required :"Please Enter the bronchoscopyCovid value.",
										number : " bronchoscopyCovid value Should be Numbers only.",
										max : "bronchoscopyCovid value should not exceed 100 % ",
									},
									
									insuranceReferralCovid : {
										required :"Please Enter the IP Referral Insurance value.",
										number : "IP Referral Insurance value Should be Numbers only.",
										max : "IP Referral Insurance value should not exceed 100 % ",
									},
									corporateReferralCovid : {
										required :"Please Enter the IP Referral Corporate value.",
										number : "IP Referral Corporate value Should be Numbers only.",
										max : "IP Referral Corporate value should not exceed 100 % ",
									},
									proceduresCovid : {
										required :"Please Enter the OP Procedures value.",
										number : " OP Procedures value Should be Numbers only.",
										max : "OP Procedures value should not exceed 100 % ",
									},
									
									
									
									
									referralOpProceduresCovid : {
										required :"Please Enter the Referral OP Procedures value.",
										number : "Referral OP Procedures value Should be Numbers only.",
										max : "Referral OP Procedures value should not exceed 100 % ",
									},
									referralOpProceduresNonCovid : {
										required :"Please Enter the Referral OP Procedures value.",
										number : "Referral OP Procedures value Should be Numbers only.",
										max : "Referral OP Procedures value should not exceed 100 % ",
									},
									
									referralCashCovid : {
										required :"Please Enter the IP Referral Cash value.",
										number : "IP Referral Cash value Should be Numbers only.",
										max : "IP Referral Cash value should not exceed 100 % ",
									},
									referralCashNonCovid : {
										required :"Please Enter the IP Referral Cash value.",
										number : "IP Referral Cash value Should be Numbers only.",
										max : "IP Referral Cash value should not exceed 100 % ",
									},
									referralOpConsultationCovid : {
										required :"Please Enter the Referral OP Consultation value.",
										number : "Referral OP Consultation value Should be Numbers only.",
										max : "Referral OP Consultation value should not exceed 100 % ",
									},
									
									referralOpConsultationNonCovid : {
										required :"Please Enter the Referral OP Consultation value.",
										number : "Referral OP Consultation value Should be Numbers only.",
										max : "Referral OP Consultation value should not exceed 100 % ",
									},
									referralOpInvestigationsCovid : {
										required :"Please Enter the Referral OP Investigations value.",
										number : "Referral OP Investigations value Should be Numbers only.",
										max : "Referral OP Investigations value should not exceed 100 % ",
									},
									referralOpInvestigationsNonCovid : {
										required :"Please Enter the Referral OP Investigations value.",
										number : "Referral OP Investigations value Should be Numbers only.",
										max : "Referral OP Investigations value should not exceed 100 % ",
									},
									
									
									
								paymentsRemarksDbKey : {
									required : "Please select the remarks."
								},
								hospDbKey : {
									required : "Please select any one of the Hospital."
								},
								bdUserName : {
									required : "Please select BD UserName."
								},
								rmUserName : {
									required : "Please select RM UserName."
								},
								
								/*errorPlacement:function(error,element){
									if(element.is(":radio")){
										error.appendTo(element.parent("#userPaymentsTypesDbKeyRadio"));
									}
								},*/
								submitHandler : function(form) {
									form.submit();
								}
							},
						});	
			
			
			$("#updateDoctorPaymentForm").validate(
					{
						rules : {
								fixedPayNonCovid : {
									required: true,
									number : true,
								},
								opConsNonCovid : {
									required: false,
									number : true,
									max  : 100,
									
								},
								ipConsNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								opInvesNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								insuranceCasesNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								corporateCasesNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								ipDirectCashNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								referralCasesNonCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								surgeonFeeNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								cabgNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								eBusNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								bronchoscopyNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								insuranceReferralNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								corporateReferralNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								proceduresNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								fixedPayCovid : {
									required: false,
									number : true,
								},
								opConsCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								ipConsCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								opInvesCovid :{
									required: false,
									number : true,
									max  : 100,
								},
								insuranceCasesCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								corporateCasesCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								ipDirectCashCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralCasesCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								surgeonFeeCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								cabgCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								eBusCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								bronchoscopyCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								insuranceReferralCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								corporateReferralCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								proceduresCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								
								referralOpProceduresCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpProceduresNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralCashCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralCashNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpConsultationCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpConsultationNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpInvestigationsCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								referralOpInvestigationsNonCovid : {
									required: false,
									number : true,
									max  : 100,
								},
								
								paymentsRemarksDbKey : {
									required: true,
								},
								bdUserName : {
									required: false,
								},
								rmUserName : {
								required : false,
								},
							},
							messages : {
								
								fixedPayNonCovid : {
									required :"Please Enter the FixedPayNonCovid value.",
									number : " FixedPayNonCovid value Should be Numbers only.",
								},
								opConsNonCovid : {
									required :"Please Enter the OP Consultation value.",
									number : "OP Consultation value Should be Numbers only.",
									max : "OP Consultation value should not exceed 100 % "
									
								},
								ipConsNonCovid : {
									required :"Please Enter the IP Cross Consultation value.",
									number : " IP Cross Consultation value Should be Numbers only.",
									max : "IP Cross Consultation value should not exceed 100 % "
								},
								opInvesNonCovid : {
									required :"Please Enter the OP Investigation value.",
									number : "OP Investigation value Should be Numbers only.",
									max : "OP Investigation value should not exceed 100 % "
								},
								insuranceCasesNonCovid : {
									required :"Please Enter the IP Own Insurance value.",
									number : "IP Own Insurance value Should be Numbers only.",
									max : "IP Own Insurance value should not exceed 100 % "
								},
								corporateCasesNonCovid : {
									required :"Please Enter the IP Own Corporate value.",
									number : " IP Own Corporate value Should be Numbers only.",
									max : "IP Own Corporate value should not exceed 100 % ",
								},
								ipDirectCashNonCovid : {
									required :"Please Enter the IP Own Cash value.",
									number : "IP Own Cash value Should be Numbers only.",
									max : "IP Own Cash value should not exceed 100 % ",
								},
								referralCasesNonCovid : {
									required :"Please Enter the referralCasesNonCovid value.",
									number : " referralCasesNonCovid value Should be Numbers only.",
									max : "referralCasesNonCovid value should not exceed 100 % ",
								},
								 surgeonFeeNonCovid : {
										required :"Please Enter the IP Cross Surgery value.",
										number : "IP Cross Surgery value Should be Numbers only.",
										max : "IP Cross Surgery value should not exceed 100 % ",
									},
									cabgNonCovid : {
										required :"Please Enter the cabgNonCovid value.",
										number : "cabgNonCovid value Should be Numbers only.",
										max : "cabgNonCovid value should not exceed 100 % ",
									},
									eBusNonCovid : {
										required :"Please Enter the cabgNonCovid value.",
										number : " cabgNonCovid value Should be Numbers only.",
										max : "cabgNonCovid value should not exceed 100 % ",
									},
									bronchoscopyNonCovid : {
										required :"Please Enter the bronchoscopyNonCovid value.",
										number : " bronchoscopyNonCovid value Should be Numbers only.",
										max : "bronchoscopyNonCovid value should not exceed 100 % ",
									},
									insuranceReferralNonCovid : {
										required :"Please Enter the IP Referral Insurance value.",
										number : "IP Referral Insurance value Should be Numbers only.",
										max : "IP Referral Insurance value should not exceed 100 % ",
									},
									corporateReferralNonCovid : {
										required :"Please Enter the IP Referral Corporate value.",
										number : "IP Referral Corporate value Should be Numbers only.",
										max : "IP Referral Corporate value should not exceed 100 % ",
									},
									proceduresNonCovid : {
										required :"Please Enter the OP Procedures value.",
										number : "OP Procedures value Should be Numbers only.",
										max : "OP Procedures value should not exceed 100 % ",
									},
								fixedPayCovid : {
									required :"Please Enter the FixedPayCovid value.",
									number : " FixedPayCovid value Should be Numbers only.",
								},
								opConsCovid : {
									required :"Please Enter the OP Consultation value.",
									number : "OP Consultation value Should be Numbers only.",
									max : "OP Consultation value should not exceed 100 % "
								},
								ipConsCovid : {
									required :"Please Enter the IP Cross Consultation value.",
									number : " IP Cross Consultation value Should be Numbers only.",
									max : "IP Cross Consultation value should not exceed 100 % "
								},
								opInvesCovid : {
									required :"Please Enter the OP Investigation value.",
									number : "OP Investigation value Should be Numbers only.",
									max : "OP Investigation value should not exceed 100 % "
								},
								insuranceCasesCovid : {
									required :"Please Enter the IP Own Insurance value.",
									number : "IP Own Insurance value Should be Numbers only.",
									max : "IP Own Insurance value should not exceed 100 % "
								},
								corporateCasesCovid : {
									required :"Please Enter the IP Own Corporate value.",
									number : " IP Own Corporate value Should be Numbers only.",
									max : "IP Own Corporate value should not exceed 100 % "
								},
								ipDirectCashCovid : {
									required :"Please Enter the IP Own Cash value.",
									number : "IP Own Cash value Should be Numbers only.",
									max : "IP Own Cash value should not exceed 100 % "
								},
								referralCasesCovid : {
									required :"Please Enter the referralCasesCovid value.",
									number : " referralCasesCovid value Should be Numbers only.",
									max : "referralCasesCovid value should not exceed 100 % "
								},
								 surgeonFeeCovid : {
										required :"Please Enter the IP Cross Surgery value.",
										number : " IP Cross Surgery value Should be Numbers only.",
										max : "IP Cross Surgery value should not exceed 100 % ",
									},
									cabgCovid : {
										required :"Please Enter the cabgCovid value.",
										number : " cabgCovid value Should be Numbers only.",
										max : "cabgCovid value should not exceed 100 % ",
									},
									eBusCovid : {
										required :"Please Enter the eBusCovid value.",
										number : " eBusCovid value Should be Numbers only.",
										max : "eBusCovid value should not exceed 100 % ",
									},
									bronchoscopyCovid : {
										required :"Please Enter the bronchoscopyCovid value.",
										number : " bronchoscopyCovid value Should be Numbers only.",
										max : "bronchoscopyCovid value should not exceed 100 % ",
									},
									insuranceReferralCovid : {
										required :"Please Enter the IP Referral Insurance value.",
										number : "IP Referral Insurance value Should be Numbers only.",
										max : "IP Referral Insurance value should not exceed 100 % ",
									},
									corporateReferralCovid : {
										required :"Please Enter the IP Referral Corporate value.",
										number : "IP Referral Corporate value Should be Numbers only.",
										max : "IP Referral Corporate value should not exceed 100 % ",
									},
									proceduresCovid : {
										required :"Please Enter the OP Procedures value.",
										number : "OP Procedures value Should be Numbers only.",
										max : "OP Procedures value should not exceed 100 % ",
									},
									
									referralOpProceduresCovid : {
										required :"Please Enter the Referral OP Procedures value.",
										number : "Referral OP Procedures value Should be Numbers only.",
										max : "Referral OP Procedures value should not exceed 100 % ",
									},
									referralOpProceduresNonCovid : {
										required :"Please Enter the Referral OP Procedures value.",
										number : "Referral OP Procedures value Should be Numbers only.",
										max : "Referral OP Procedures value should not exceed 100 % ",
									},
									
									referralCashCovid : {
										required :"Please Enter the IP Referral Cash value.",
										number : "IP Referral Cash value Should be Numbers only.",
										max : "IP Referral Cash value should not exceed 100 % ",
									},
									referralCashNonCovid : {
										required :"Please Enter the IP Referral Cash value.",
										number : "IP Referral Cash value Should be Numbers only.",
										max : "IP Referral Cash value should not exceed 100 % ",
									},
									referralOpConsultationCovid : {
										required :"Please Enter the Referral OP Consultation value.",
										number : "Referral OP Consultation value Should be Numbers only.",
										max : "Referral OP Consultation value should not exceed 100 % ",
									},
									
									referralOpConsultationNonCovid : {
										required :"Please Enter the Referral OP Consultation value.",
										number : "Referral OP Consultation value Should be Numbers only.",
										max : "Referral OP Consultation value should not exceed 100 % ",
									},
									referralOpInvestigationsCovid : {
										required :"Please Enter the Referral OP Investigations value.",
										number : "Referral OP Investigations value Should be Numbers only.",
										max : "Referral OP Investigations value should not exceed 100 % ",
									},
									referralOpInvestigationsNonCovid : {
										required :"Please Enter the Referral OP Investigations value.",
										number : "Referral OP Investigations value Should be Numbers only.",
										max : "Referral OP Investigations value should not exceed 100 % ",
									},
									
									
								paymentsRemarksDbKey : {
									required : "Please select the remarks."
								},
								bdUserName : {
									required : "Please select BD UserName."
								},
								rmUserName : {
									required : "Please select RM UserName."
								},
								/*errorPlacement:function(error,element){
									if(element.is(":radio")){
										error.appendTo(element.parent("#userPaymentsTypesDbKeyRadio"));
									}
								},*/
								submitHandler : function(form) {
									form.submit();
								}
							},
						});	
			
			
			
			
			
			
			$("#covidPackageDetailsForm")
			.validate(
					{
						rules : {
							docDbKeyArray : {
								required: true,
							},
							
						},
						messages : {
							docDbKeyArray : {
								required :"Please select the Doctor(s)."
							},
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
			
			
			
			
			$("#callRecordScriptForm")
			.validate(
					{
						rules : {
							scriptType : {
								required: true,
							},
							scriptItems : {
								required: false,
							},
							scriptCategory : {
								required: false,
							},
							scriptTextData : {
								required: true,
							},
							questionList : {
								required: true,
							},
							answerList : {
								required: true,
							},
						},
						messages : {
							scriptType : {
								required :"Please Enter scriptType."
							},
							scriptItems : {
								required :"Please Enter scriptItems."
							},
							scriptCategory : {
								required :"Please Enter scriptCategory."
							},
							scriptTextData : {
								required :"Please Enter scriptTextData."
							},
							questionList : {
								required :"Please Enter Question."
							},
							answerList : {
								required :"Please Enter Answer."
							},
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
			
			
			
			
			$("#editCallRecordScriptForm")
			.validate(
					{
						rules : {
							
							scriptTextData : {
								required: true,
							},
							questionList : {
								required: false,
							},
							answerList : {
								required: false,
							},
						},
						messages : {
							
							scriptTextData : {
								required :"Please Enter scriptTextData."
							},
							questionList : {
								required :"Please Enter Question."
							},
							answerList : {
								required :"Please Enter Answer."
							},
						submitHandler : function(form) {
							form.submit();
						}
						}
						
					});
			
			
			$("#vivoBioCallRecord").validate({

				rules : {

					customerName : {
						required : true,
						letterswithspace:true 
					},
					agentName : {
						required : true,
						letterswithspace:true
					},
					callDate : "required",
					typeOfCall : {
						required : true,
					},
					categoryOfCall : {
						required : true,
					},
					purposeOfCall : "required",
					mobileNumber : {
						required : true,
						minlength : 10,
						maxlength : 10,
						number : true
					},
					agentRemarks : "required",
					optionName : {
						required : true,
					},

				},
				messages : {

					customerName : {
						required : "Please enter Customer Name.",
						letterswithspace : "Alphabets only  Allowed"
					},

					agentName : {
						required : "Please enter a  Agent name.",
						letterswithspace : "Alphabets only  Allowed"

					},
					callDate : "Please enter call date.",
					typeOfCall : {
						required : "Please select call type.",

					},
					categoryOfCall : {
						required : "Please select call category.",
					},
					purposeOfCall : "Please enter purpose of call.",
					mobileNumber : {
						required : "Please enter Phone Number ",
						minlength : "Number should be 10 Digits.",
						maxlength : "Number should be 10 Digits.",
						number : "Number Should be Numbers."
					},
					agentRemarks : "Please enter agent remarks. ",
					optionName : {
						required : "Please select Call DisPosition type.",
					},
				},
				submitHandler : function(form) {

					form.submit();
				}
			});
					
}
};

	$(D).ready(function($) {
		JQUERY4U.UTIL.setupFormValidation();
	});

})(jQuery, window, document);












