<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />

<div id="page-wrapper">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<h3 class="page-header">
					Floors List for <b>${proj.projectDefination}</b>
				</h3>
				<div class="col-md-6"></div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h5>
							Floors List for <b>${proj.projectDefination}</b>
						</h5>
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
													aria-label="Employee Name: activate to sort column descending"
													style="width: 171px;">S.No</th>
												<th class="sorting" tabindex="0"
													aria-controls="dataTables-example" rowspan="1" colspan="1"
													aria-label="Browser: activate to sort column ascending"
													style="width: 207px;">Floor Number</th>
												<th class="sorting" tabindex="0"
													aria-controls="dataTables-example" rowspan="1" colspan="1"
													aria-label="Browser: activate to sort column ascending"
													style="width: 207px;">Floor Name</th>
												<th class="sorting" tabindex="0"
													aria-controls="dataTables-example" rowspan="1" colspan="1"
													aria-label="Browser: activate to sort column ascending"
													style="width: 207px;">Floor Status</th>
												<th style="width: 80px;">Work Status</th>

											</tr>
										</thead>
										<tbody>

											<c:forEach var="floor" items="${floorsList}"
												varStatus="counter">


												<tr class="gradeA odd" role="row">
													<td class="sorting_1">${counter.count}</td>
													<td>${floor.floorNo}</td>
													<td>${floor.floorName}</td>

													<td><c:choose>
															<c:when test="${floor.status eq 'N' }">Not Started</c:when>
															<c:otherwise>
																<c:choose>
																	<c:when test="${floor.status eq 'P' }">In Progress</c:when>
																	<c:otherwise>
																		<c:choose>
																			<c:when test="${floor.status eq 'C' }">Complted</c:when>
																		</c:choose>
																	</c:otherwise>
																</c:choose>
															</c:otherwise>
														</c:choose></td>

													<td class="center"><a class="btn-info btn-sm"
														href="<%=request.getContextPath()%>/projectFLoorStatus/floorStatusReport/${proj.id}/${floor.id}">
															<i class="fa fa-file-excel-o" aria-hidden="true"
															title="Floor Status"></i>
													</a></td>

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
			responsive : true,
			"paging": false
		});
	});
</script>
<jsp:include page="footer.jsp" />
