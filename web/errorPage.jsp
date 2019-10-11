<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="Ola Glal & Mahmoud Qussai Al-Wazer">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Error Page</title>
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
    <body>
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

        <section id="calculations">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2 class="section-heading">Salary</h2>
                        <hr class="my-4">
                    </div>
                </div>
            </div>

            <div class="container">
                <div class="row justify-content-center">

                    <h3>Message:</h3>
                    <%=exception%>
                </div>
            </div>

            <!-- Footer -->
            <footer>
                <div class="container">
                    <div class="row">
                        <div class="col-12">
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
