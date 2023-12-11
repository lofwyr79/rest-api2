function addUserRole() {
    // Get form data
    var formData = {
        firstName: $('#firstName').val(),
        lastName: $('#lastName').val(),
        userId: $('#userId').val(),
        role: $('#role').val(),
        pillar: $('#pillar').val(),
        validUntil: $('#validUntil').val()
    };

    // Send POST request to the backend
    $.ajax({
        type: 'POST',
        contentType: 'application/json',
        url: '/api/userRoles',
        data: JSON.stringify(formData),
        success: function (data) {
            console.log('User role added successfully.');
            // Update user roles display or perform other actions as needed
        },
        error: function (error) {
            console.error('Error adding user role:', error);
        }
    });
}

// Add additional JavaScript logic as needed
// main.js

/// main.js

 // Function to fetch and display user roles
 function getUserRoles() {
     $.ajax({
         type: 'GET',
         url: '/api/userRoles',
         success: function (data) {
             displayUserRoles(data);
         },
         error: function (error) {
             console.error('Error fetching user roles:', error);
         }
     });
 }

 // Function to add a new user role
 function addUserRole() {
     // Retrieve form data
     var formData = {
         firstName: $('#firstName').val(),
         lastName: $('#lastName').val(),
         userId: $('#userId').val(),
         role: $('#role').val(),
         pillar: $('#pillar').val(),
         validUntil: $('#validUntil').val()
     };

     // Send POST request to add user role
     $.ajax({
         type: 'POST',
         url: '/api/userRoles',
         contentType: 'application/json',
         data: JSON.stringify(formData),
         success: function () {
             getUserRoles(); // Refresh the displayed user roles
             clearForm(); // Clear the form fields
         },
         error: function (error) {
             console.error('Error adding user role:', error);
         }
     });
 }

 // Function to update an existing user role
 function updateUserRole() {
     // Retrieve form data
     var formData = {
         firstName: $('#firstName').val(),
         lastName: $('#lastName').val(),
         userId: $('#userId').val(),
         role: $('#role').val(),
         pillar: $('#pillar').val(),
         validUntil: $('#validUntil').val()
     };

     // Send PUT request to update user role
     $.ajax({
         type: 'PUT',
         url: '/api/userRoles/' + formData.userId,
         contentType: 'application/json',
         data: JSON.stringify(formData),
         success: function () {
             getUserRoles(); // Refresh the displayed user roles
             clearForm(); // Clear the form fields
         },
         error: function (error) {
             console.error('Error updating user role:', error);
         }
     });
 }

 // Function to delete an existing user role
 function deleteUserRole() {
     // Retrieve user ID from the form
     var userId = $('#userId').val();

     // Send DELETE request to delete user role
     $.ajax({
         type: 'DELETE',
         url: '/api/userRoles/' + userId,
         success: function () {
             getUserRoles(); // Refresh the displayed user roles
             clearForm(); // Clear the form fields
         },
         error: function (error) {
             console.error('Error deleting user role:', error);
         }
     });
 }

 // Function to clear the form fields
 function clearForm() {
     $('#firstName').val('');
     $('#lastName').val('');
     $('#userId').val('');
     $('#role').val('');
     $('#pillar').val('');
     $('#validUntil').val('');
 }

 // Function to display user roles in the HTML
 function displayUserRoles(userRoles) {
     var userRolesDiv = $('#userRoles');
     userRolesDiv.empty();

     userRoles.forEach(function (userRole) {
         var roleHtml = '<p>' +
             'Name: ' + userRole.firstName + ' ' + user

// Call the function to fetch and display user roles when the page loads
$(document).ready(function () {
    getUserRoles();
});
