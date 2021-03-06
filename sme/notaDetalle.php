<!-- Modal de Registro -->
<div class="modal fade" id="modalRegistroNotas" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
		<div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal" aria-hidden="true" onclick="variables.abrioDetalle = false;limpiarDatos();">&times;</button>
	          <h4 class="modal-title" id="myModalLabel"><b>Registro de Notas</b></h4>
	        </div>
	        <form class=""  method="post">
		        <div  id="datosAqui">
					<div class="modal-body">
						<div class="form-group">
						  <select class="form-control" id="slnCurso">
						  	<option value='0' disabled selected> Seleccione Curso </option>"
						  </select>
						</div>
						<div class="form-group">
							<select class="form-control" id="slnPeriodo">
								<option value='0' disabled selected> Seleccione Periodo </option>"
							</select>
						</div>
						<div class="form-group">
							<select class="form-control" id="slnEmpleados">
								<option value='0' disabled selected> Seleccione Empleado </option>"
							</select>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading">Datos de Alumno</div>
							<div class="panel-body">
								<div class="form-inline">
									<div class="form-group">
										<input type="hidden" id="hdnidAlumno">
										<label for="txtDNI">N° DNI</label>
										<input type="text" placeholder="DNI" class="form-control" id="txtDNI" maxlength="8">
										<button type="button" class='btn btn-xs btn-info' id="btnBuscarAlumnoPorDni" >
											<span class='glyphicon glyphicon-search'>
										</button>
								    </div>
								</div>
								<div ></div>
								<div class="form-inline">
									<div class="form-group">
										<label class="sr-only" for="txtNombreAlum">Nombre</label>
										<input placeholder="Nombre" disabled="disabled" type="text" class="form-control" id="txtNombreAlum" width="200px">
										<label class="sr-only" for="txtApellAlumn">Apellidos</label>
										<input placeholder="Apellidos" type="text" disabled="disabled" class="form-control" id="txtApellAlumn">
									</div>
								</div>
								<div class="form-inline">
									<div class="form-group">
										<select class="form-control" id="slnTipoNota">
											<option value='0' disabled selected> Seleccione Tipo de Nota </option>"
										</select>

										<input type="number" id="txtvalornota" class="form-control" placeholder="Nota" min="0"  max="20" maxlength="99">
									</div>
								</div>

							</div>
							<div class="panel-footer">
								<input type="button" class="btn btn-warning btn-block " id="btnguardarNota" value="Adicionar Nota">
							</div>
						</div>
						<hr>
						<div class="form-inline">
							<label >Lista de Notas</label>
							<input type="button" class="btn btn-warning pull-right" style="margin:-7px 5px 5px 5px" id="btnBuscarNotas" value="Buscar Notas">
						</div>

						<div id="divTablaNotas">
							<table class="table table-striped table-responsive table-bordered table-condensed table-hover">
						 		<thead>
							 		<tr class="warning">
							 			<th>Tipo de Examen</th>
							 			<th>Nom Empleado</th>
							 			<th>Nota</th>
							 			<th colspan="1">Acciones</th>
							 		</tr>
							 	</thead>
							 	<tbody id="tblNotas">

							 	</tbody>
						 	</table>
						</div>
					</div>
					<div class="modal-footer">

					</div>
		        </div>
	        </form>
      	</div>
    </div>
 </div>
<!-- /Modal de Registro -->
