<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="Ola Glal & Mahmoud Qussai Al-Wazer">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Salary | Step 1</title>
        <link href="/img/favicon.ico" rel="icon" type="image/x-icon" />

        <!-- Bootstrap core CSS -->
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom fonts -->
        <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

        <!-- Custom styles -->
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
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#about">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#calculations">Calculations</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#team">Team</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="#contact">Contact</a>
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
                    <form action="salaryStep2.html" id="first_form" method="">
                        <div class="align-items-center" >
                            <h5>Name : </h5><input class="form-control" type="text" name="name" id="name" placeholder="Enter your Name" />
                            <h5>Provincy : <span class="required" >*</span></h5>
                            <select name="province" id="province" class="form-control"><option value="" selected="selected">Select</option>
                                <option value="0">Alberta</option>
                                <option value="1">British Columbia</option>
                                <option value="2">Manitoba</option>
                                <option value="3">New Brunswick</option>
                                <option value="4">Newfoundland and Labrador</option>
                                <option value="5">Northwest Territories</option>
                                <option value="6">Nova Scotia</option>
                                <option value="7">Nunavut</option>
                                <option value="8">Ontario</option>
                                <option value="9">Prince Edward Island</option>
                                <option value="10">Quebec</option>
                                <option value="11">Saskatchewan</option>
                                <option value="12">Yukon</option>
                            </select>

                            <h5>Pay Period : <span class="required" >*</span></h5>
                            <select name="payPeriod" id="payPeriod" class="form-control"><option value="" selected="selected">Select</option>
                                <option value="0">Daily (240 pay periods a year)</option>
                                <option value="1">Weekly (52 pay periods a year)</option>
                                <option value="2">Biweekly (26 pay periods a year)</option>
                                <option value="3">Semi-monthly (24 pay periods a year)</option>
                                <option value="4">Monthly (12 pay periods a year)</option>
                                <option value="5">(10 pay periods a year)</option>
                                <option value="6">(13 pay periods a year)</option>
                                <option value="7">(22 pay periods a year)</option>
                                <option value="8">Weekly (53 pay periods a year)</option>
                                <option value="9">Biweekly (27 pay periods a year)</option></select>
                        </div>

                        <div class="text-center">
                            <input class="btn btn-primary btn-xl " type="submit" value="Next" />
                        </div>

                    </form>
                    <!-- END OF Salary -->
                </div>
            </div>
        </div>
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

        <!-- Custom scripts for this template -->
        <script src="js/app.js"></script>
        <script src="js/validation.js"></script>

</body>
</html>
