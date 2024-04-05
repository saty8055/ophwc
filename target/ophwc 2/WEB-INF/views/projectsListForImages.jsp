<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />

<div id="page-wrapper">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<h3 class="page-header">Projects List</h3>
				<div class="col-md-6"></div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h5>Projects List</h5>
					</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<div id="dataTables-example_wrapper"
							class="dataTables_wrapper form-inline dt-bootstrap no-footer">
							<div class="row">
								<div class="col-sm-12">
									<table width="100%"
										class="table table-striped table-bordered table-hover dataTable no-footer dtr-inline"
										id="dataTables-example" role="grid"
										aria-describedby="dataTables-example_info"
										style="width: 100%;">
										<thead>
											<tr role="row" class="bg-warning">
												<th class="sorting_asc" tabindex="0"
													aria-controls="dataTables-example" rowspan="1" colspan="1"
													aria-sort="ascending"
													aria-label="Browser: activate to sort column descending"
													style="width: 171px;">S.NO</th>
												<th class="sorting" tabindex="0"
													aria-controls="dataTables-example" rowspan="1" colspan="1"
													aria-sort="ascending"
													aria-label="Browser: activate to sort column descending"
													style="width: 171px;">Project Name</th>
												<th class="sorting" tabindex="0"
													aria-controls="dataTables-example" rowspan="1" colspan="1"
													aria-label="Browser: activate to sort column ascending"
													style="width: 207px;">Project Definition</th>
												<th class="sorting" tabindex="0"
													aria-controls="dataTables-example" rowspan="1" colspan="1"
													aria-label="Browser: activate to sort column ascending"
													style="width: 207px;">Division</th>
												<th class="sorting" tabindex="0"
													aria-controls="dataTables-example" rowspan="1" colspan="1"
													aria-label="Browser: activate to sort column ascending"
													style="width: 207px;">NatureOfWork</th>
												<th class="sorting" tabindex="0"
													aria-controls="dataTables-example" rowspan="1" colspan="1"
													aria-label="Browser: activate to sort column ascending"
													style="width: 207px;">View Images</th>

											</tr>
										</thead>
										<tbody>

											<c:forEach var="project" items="${projList}"
												varStatus="counter">


												<tr class="gradeA odd" role="row">
													<td class="sorting_1">${counter.count}</td>
													<td>${project.projectName}</td>
													<td>${project.projectDefination}</td>
													<td>${project.divisions.divisionName}</td>
													<td>${project.natureOfProject.name}</td>

													<%-- <td class="center"><a class="btn-primary btn-sm"
														href="<%=request.getContextPath()%>/project/getImagesOfProject/${project.id}">
															<i class="fa">View Images </i>
													</a></td> --%>

													<td class="center"><c:choose>
															<c:when test="${project.imagesPaths ne null }">
																<a class="btn-primary btn-sm"
																	href="<%=request.getContextPath()%>/project/getImagesOfProject/${project.id}">
																	<i class="fa">View Images </i>
																</a>
															</c:when>
															<c:otherwise>No Images Available</c:otherwise>
														</c:choose></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>

						</div>
					</div>
					<!-- /.table-responsive -->
				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- ... Your content goes here ... -->

</div>
<script>
	$(document).ready(function() {
		$('#dataTables-example').DataTable({
			"paging" : true,
			"ordering" : true,
			"info" : false,
			stateSave : true
		});
	});
</script>
<jsp:include page="footer.jsp" />
