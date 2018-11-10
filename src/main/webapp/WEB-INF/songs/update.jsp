<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1>All Songs</h1>
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Artist</th>
            <th>Link</th>
            <th>Rating</th>
        </tr>
    </thead>
    <tbody>
    	<form:form>
        <c:forEach items="${songs}" var="song">
        <tr>
            <td><c:out value="${song.title}"/></td>
            <td><c:out value="${song.artist}"/></td>
            <td><c:out value="${song.link}"/></td>
            <td><c:out value="${song.rating}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/songs/new">New Song</a>
