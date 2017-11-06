"use strict";

$.ajaxSetup({
    cache: false
});

function saveStudent(){
	var student = {};
	student.stuName = $('#studentName').val();
	
	 $.ajax({
	        method: 'POST',
	        url: '/ProjectTemp/rest/Student/saveStudent',
	        data: JSON.stringify(student),
	        contentType : 'application/json'
	    })
	            .done(function (msg) {
	                console.log(msg);
	                $('#uppercase').append(msg.toUpperCase());

	            })
	            .fail(function (jqXHR, textStatus) {
	                console.log(jqXHR);
	                showAlert(jqXHR.responseText)
	            });
}

