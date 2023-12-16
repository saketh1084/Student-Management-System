   

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body bgcolor="pink">
    
        <h1>Edit Student Details Data</h1>  
       <form:form method="POST" action="/editu">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="sid" /></td>  
         </tr>  
         <tr>    
            <td>FullName :</td>    
            <td><form:input path="fullname" /></td>  
           </tr>  
         <tr>    
          <td> Subject1: </td>   
          <td><form:input path="sub1"  /></td>  
         </tr>    
         <tr>    
          <td>Subject2 :</td>    
          <td><form:input path="sub2" /></td>  
         </tr>   
         <tr>    
            <td>Subject3 :</td>    
            <td><form:input path="sub3" /></td>  
           </tr> 
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="EditSave" /></td>    
         </tr>    
        </table>    
       </form:form>  
       <a href="/viewAllStudents">View All User Details</a><p></p>
       <a href="/">Add New Students details Here</a>  

       </body>