<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Auto Park</title>
        <jsp:include page="_css.jsp"></jsp:include>
        </head>

        <body class="d-flex">
        <jsp:include page="_header.jsp"></jsp:include>
            <div class="w-80">
                <div class="container">
                    <form class="row py-4">
                        <div class="col-8">
                            <h4>Datos Empresa</h4>
                            <div class="bg-white p-3 border my-3">
                                <div class="form-group d-flex align-items-center">
                                    <label class="w-25">Rut: </label>
                                    <input type="text" class="form-control"  placeholder="Ingresa rut">
                                </div>
                                <div class="form-group d-flex align-items-center">
                                    <label class="w-25">Nombre:</label>
                                    <input type="text" class="form-control" placeholder="Ingresa nombre">
                                </div>
                                <div class="form-group d-flex align-items-center">
                                    <label class="w-25">Teléfono:</label>
                                    <input type="text" class="form-control" placeholder="Ingresa teléfono">
                                </div>
                                <div class="form-group d-flex align-items-center">
                                    <label class="w-25">Email: </label>
                                    <input type="email" class="form-control" placeholder="Ingresa email">
                                </div>
                            </div>
                        </div>
                        <div class="col-4 mt-5">
                            <h4 class="mb-3">Opciones de pago</h4>
                            <div class="form-check">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="rbOpcionesPago" value="1" checked>
                                    Transferencia
                                </label>
                            </div>
                            <div class="form-check">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="rbOpcionesPago" value="2">
                                    Pago en línea
                                </label>
                            </div>
                            <div class="form-check disabled">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="rbOpcionesPago" value="3">
                                    Orden de compra
                                </label>
                            </div>
                            <h4 class="mb-3 mt-3 border-top pt-2">Opciones de envío boleta</h4>
                            <div class="form-check">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="rbEnvio" value="1" checked>
                                    Correo electrónico
                                </label>
                            </div>
                            <div class="form-check">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="rbEnvio" value="2">
                                    Dirección particular
                                </label>
                            </div>
                        </div>
                        <div class="col-8">
                            <div>
                                <div class="bg-white p-3 border mb-3  d-flex flex-column">
                                    <label >Seleccione Estacionamiento, indique la cantidadde dinero que mostró aplicación móvil</label>
                                    <div class="form-group d-flex align-items-center w-100">

                                        <select class="custom-select mb-2 mr-sm-2 mb-sm-0 w-100" id="inlineFormCustomSelect">
                                            <option selected>Choose...</option>
                                            <option value="1">One</option>
                                            <option value="2">Two</option>
                                            <option value="3">Three</option>
                                        </select>
                                        <a href="#!" class="btn btn-secondary"> Agregar</a>
                                    </div>
                                </div>
                            </div>
                            <table class="table table-sm table-hover table-morado">
                                <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">First Name</th>
                                        <th scope="col">Last Name</th>
                                        <th scope="col">Username</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">1</th>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td>@mdo</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">2</th>
                                        <td>Jacob</td>
                                        <td>Thornton</td>
                                        <td>@fat</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">3</th>
                                        <td colspan="2">Larry the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                </tbody>
                            </table>
                            <div class="d-flex justify-content-between px-4">
                                <h5>$ 7.000</h5>
                                <button type="submit" class="btn btn-primary">Pagar</button>
                            </div>
                            

                        </div>
                    </form>
                </div>

            </div>
        <jsp:include page="_js.jsp"></jsp:include>
    </body>
</html>
