<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="errorPage.jsp"%>
<jsp:useBean id = "tax" scope = "session" class= "Model.Calculations"></jsp:useBean>

<jsp:useBean id = "res" scope = "session" class= "Database.Results"></jsp:useBean>

<!DOCTYPE html>
<html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="Ola Glal & Mahmoud Qussai Al-Wazer">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Salary</title>
        <link href="/img/favicon.ico" rel="icon" type="image/x-icon" />

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts -->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

        <!-- Custom styles -->
        <link rel="stylesheet" href="css/jquery.steps.css">
        <link href="css/style.css" rel="stylesheet">
        <link href="css/cal.css" rel="stylesheet">


    </head>

    <body id="page-top">

        <!-- Navigation -->
        <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top">Payroll Deductions Online Calculator</a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="index.html">Home</a>
                        </li>

                        <!-- <li class="nav-item">
                <a class="nav-link js-scroll-trigger" href="#about">About</a>
        </li> -->
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="index.html#calculations">Calculations</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="index.html#team">Team</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="index.html#contact">Contact</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <section id="result">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2 class="section-heading">Result</h2>
                        <hr class="my-4">
                    </div>
                </div>
            </div>

            <div class="col-8 container">

                <dl class="dl-horizontal dl-horizontal-cra mrgn-tp-lg dl-label-value-pair-rhpd-md">
                    <dt>Employer's name:</dt>
                    <dd><%= res.getEmployeeName() %></dd>


                    <dt>Pay period frequency:</dt>
                    <dd> <%= tax.getP() %> </dd>


                    <dt>Province of employment:</dt>
                    <dd> <%= res.getProvince() %> </dd>

                    <dt>Federal amount from TD1:</dt>
                    <dd> <%= res.getFederalCC() %> </dd>

                    <dt>Provincial amount from TD1:</dt>
                    <dd> <%= res.getProvincialCC() %> </dd>
                </dl>


                <table role="presentation" class="table table-condensed table-striped ">
                    <tbody>
                        <tr>
                            <td>Salary or wages income</td>
                            <td class="text-right"></td>
                            <td class="text-right">
                                <%= res.getSalary()%>
                            </td>
                            <td class="text-right"></td>
                        </tr>

                        <tr>
                            <td>Taxable benefit paid in cash</td>
                            <td class="text-right"></td>
                            <td class="text-right">
                                <%= tax.getEmployerRrsp() %>
                            </td>
                            <td class="text-right"></td>
                        </tr>

                        <tr>
                            <td><strong>Total cash income</strong></td>
                            <td class="text-right"></td>
                            <td class="text-right"></td>
                            <td class="text-right">
                                <strong> <%= res.getTotalIncome() %> </strong>
                            </td>
                        </tr>
                        <tr>
                            <td>Taxable income for the pay period</td>
                            <td class="text-right"></td>
                            <td class="text-right">
                                <%= res.getTaxableIncomePayPeriod() %>
                            </td>
                            <td class="text-right"></td>
                        </tr>
                        
                        <tr>
                            <td>Federal tax deduction</td>
                            <td class="text-right">
                                <%= res.getFederalTax() %>
                            </td>
                            <td class="text-right"></td>
                            <td class="text-right"></td>
                        </tr>
                        <tr>
                            <td>

                                Provincial tax deduction

                            </td>
                            <td class="text-right">
                                <%= res.getProvincialTax() %>
                            </td>
                            <td class="text-right"></td>
                            <td class="text-right"></td>
                        </tr>

                        <tr>
                            <td>Additional tax deduction</td>
                            <td class="text-right">
                                <%= res.getAdditionalDeduct() %>
                            </td>
                            <td class="text-right"></td>
                            <td class="text-right"></td>
                        </tr>

                        <tr>
                            <td>Total tax deductions</td>
                            <td class="text-right"></td>
                            <td class="text-right">
                                <%= res.getTotalDeduct() %>
                            </td>
                            <td class="text-right"></td>
                        </tr>
                        <tr>
                            <td>

                                CPP deductions

                            </td>
                            <td class="text-right"></td>
                            <td class="text-right">
                                <%= res.getCppDeduct() %>
                            </td>
                            <td class="text-right"></td>
                        </tr>
                        <tr>
                            <td>EI deductions</td>
                            <td class="text-right"></td>
                            <td class="text-right">
                                <%= res.getEiDeduct() %>
                            </td>
                            <td class="text-right"></td>
                        </tr>

                        <tr>
                            <td><strong>Total deductions</strong></td>
                            <td class="text-right"></td>
                            <td class="text-right"></td>
                            <td class="text-right">
                                <strong> <%= res.getTotalDeduct() %> </strong>
                            </td>
                        </tr>
                        <tr class="result-tr">
                            <td><strong>Net amount</strong></td>
                            <td class="text-right"></td>
                            <td class="text-right"></td>
                            <td class="text-right">
                                <strong> <%= res.getNetAmount() %> </strong>
                            </td>
                        </tr>
                    </tbody>
                </table>


            </div>
        </section>
        <!-- Footer -->
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <span class="copyright">Copyright &copy; X-Team 2018</span>
                    </div>
                </div>
            </div>
        </footer>

        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Plugin JavaScript -->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
        <script src="vendor/scrollreveal/scrollreveal.min.js"></script>
        <script src="vendor/jquery-validation/jquery.validate.min.js"></script>
        <script src="js/modernizr-2.6.2.min.js"></script>
        <script src="js/jquery.cookie-1.3.1.js"></script>
        <script src="js/jquery.steps.min.js"></script>
        <!-- Custom scripts for this template -->
        <script src="js/app.js"></script>
        <script src="js/enable.js"></script>

    </body>

</html>
