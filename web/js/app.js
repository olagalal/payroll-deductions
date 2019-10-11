(function ($) {
    "use strict"; // Start of use strict

    // Smooth scrolling using jQuery easing
    $('a.js-scroll-trigger[href*="#"]:not([href="#"])').click(function () {
        if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') && location.hostname == this.hostname) {
            var target = $(this.hash);
            target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
            if (target.length) {
                $('html, body').animate({
                    scrollTop: (target.offset().top - 57)
                }, 1000, "easeInOutExpo");
                return false;
            }
        }
    });

    // Closes responsive menu when a scroll trigger link is clicked
    $('.js-scroll-trigger').click(function () {
        $('.navbar-collapse').collapse('hide');
    });

    // Activate scrollspy to add active class to navbar items on scroll
    $('body').scrollspy({
        target: '#mainNav',
        offset: 57
    });

    // Collapse Navbar
    var navbarCollapse = function () {
        if ($("#mainNav").offset().top > 100) {
            $("#mainNav").addClass("navbar-shrink");
        } else {
            $("#mainNav").removeClass("navbar-shrink");
        }
    };
    // Collapse now if page is not at top
    navbarCollapse();
    // Collapse the navbar when page is scrolled
    $(window).scroll(navbarCollapse);

    // Scroll reveal calls
    window.sr = ScrollReveal();
    sr.reveal('.sr-icons', {
        duration: 600,
        scale: 0.3,
        distance: '0px'
    }, 200);
    sr.reveal('.sr-button', {
        duration: 1000,
        delay: 200
    });
    sr.reveal('.sr-contact', {
        duration: 600,
        scale: 0.3,
        distance: '0px'
    }, 300);

})(jQuery); // End of use strict


function form_elements() {
    $('.form-group.form-group-default').click(function () {
        $(this).find('input').focus();
    });
    $('body').on('focus', '.form-group.form-group-default :input', function () {
        $('.form-group.form-group-default').removeClass('focused');
        $(this).parents('.form-group').addClass('focused');
    });

    $('body').on('blur', '.form-group.form-group-default :input', function () {
        $(this).parents('.form-group').removeClass('focused');
        if ($(this).val()) {
            $(this).closest('.form-group').find('.control-label').addClass('fade');
        } else {
            $(this).closest('.form-group').find('.control-label').removeClass('fade');
        }
    });

    $('.form-group.form-group-default .checkbox, .form-group.form-group-default .radio').hover(function () {
        $(this).parents('.form-group').addClass('focused');
    }, function () {
        $(this).parents('.form-group').removeClass('focused');
    });

}


$(document).ready(function () {

    $(window).trigger("resize");
    form_elements();


});

var form = $("#salary");
form.validate({
    errorPlacement: function errorPlacement(error, element) {
        element.before(error);
    },
    rules: {
        province: {
            required: true
        },
        payPeriod: {
            required: true
        },
        income: {
            required: true,
            number: true
        },
        ciEI: {
            number: true
        },
        iEI: {
            number: true
        },
        EI: {
            number: true
        },
        EmployerRrsp: {
            number: true
        },
        RRSP: {
            number: true
        },
        RPP: {
            number: true
        },
        PRPP: {
            number: true
        },
        ud: {
            number: true
        },
        pz: {
            number: true
        },
        deduction: {
            number: true
        },
        mp: {
            number: true
        },
        claimCodeFed: {
            number: true
        },
        nameTD1: {
            number: true
        },
        claimCodePro: {
            number: true
        },
        yearToDatePeAmount: {
            number: true
        },
        yearToDateCPPAmount: {
            number: true

        },
        yearToDateIeAmount: {
            number: true
        },
        yearToDateEIAmount: {
            number: true
        },
        EIname: {
            number: true
        }
    }
});

form.steps({
    headerTag: "h3",
    bodyTag: "fieldset",
    transitionEffect: "slideLeft",
    onStepChanging: function (event, currentIndex, newIndex)
    {

        var mainSelect = $('#province');
        var claimCodePro = $('#claimCodePro');
        mainSelect.on('change', function () {
            claimCodePro.find('option').remove();
        });
        if (currentIndex === 2 && mainSelect.val() != '')
        {
            var selectedPre = mainSelect.val();
            console.log(selectedPre);
            if (selectedPre == 'alberta') {
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 18,915.00 (Claim Code 1)",
                    "2": "18,915.01 - 21,682.00 (Claim Code 2)",
                    "3": "21,682.01 – 24,449.00  (Claim Code 3)",
                    "4": "24,449.01 – 27,216.00  (Claim Code 4)",
                    "5": "27,216.01 – 29,983.00 (Claim Code 5)",
                    "6": "29,983.01 – 32,750.00 (Claim Code 6)",
                    "7": "32,750.01 – 35,517.00  (Claim Code 7)",
                    "8": "35,517.01 – 38,284.00 (Claim Code 8)",
                    "9": "38,284.01 – 41,051.00 (Claim Code 9)",
                    "10": "41,051.01 – 43,818.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)"
                }
            } else if (selectedPre == 'british_columbia') {
                //BritishColumbia
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 10,412.01 (Claim Code 1)",
                    "2": "10,412.01 – 12,755.00 (Claim Code 2)",
                    "3": "12,755.01 – 15,098.00 (Claim Code 3)",
                    "4": "15,098.01 – 17,441.00 (Claim Code 4)",
                    "5": "17,441.01 – 19,784.00 (Claim Code 5)",
                    "6": "19,784.01 – 22,127.00 (Claim Code 6)",
                    "7": "22,127.01 – 24,470.00 (Claim Code 7)",
                    "8": "24,470.01 – 26,813.00 (Claim Code 8)",
                    "9": "26,813.01 – 29,156.00 (Claim Code 9)",
                    "10": "29,156.01 – 31,499.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)"
                }
            } else if (selectedPre == 'manitoba') {
                //Manitoba
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 9,382.00  (Claim Code 1)",
                    "2": "9,382.01 – 11,075.00 (Claim Code 2)",
                    "3": "11,075.01 – 12,768.00 (Claim Code 3)",
                    "4": "12,768.01 – 14,461.00 (Claim Code 4)",
                    "5": "14,461.01 – 16,154.00 (Claim Code 5)",
                    "6": "16,154.01 – 17,847.00 (Claim Code 6)",
                    "7": "17,847.01 – 19,540.00 (Claim Code 7)",
                    "8": "19,540.01 – 21,233.00 (Claim Code 8)",
                    "9": "21,233.01 – 22,926.00  (Claim Code 9)",
                    "10": "22,926.01 – 24,619.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)",
                }
            } else if (selectedPre == 'new_burnswick') {
                //NewBrunswick
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 10,043.00 (Claim Code 1)",
                    "2": "10,043.01 – 12,271.00 (Claim Code 2)",
                    "3": "12,271.01 – 14,499.00 (Claim Code 3)",
                    "4": "14,499.01 – 16,727.00 (Claim Code 4)",
                    "5": "16,727.01 – 18,955.00  (Claim Code 5)",
                    "6": "18,955.01 – 21,183.00 (Claim Code 6)",
                    "7": "21,183.01 – 23,411.00  (Claim Code 7)",
                    "8": "23,411.01 – 25,639.00 (Claim Code 8)",
                    "9": "25,639.01 – 27,867.00  (Claim Code 9)",
                    "10": "27,867.01 – 30,095.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)"
                }
            } else if (selectedPre == 'newfoundland') {
                //NewfoundlandandLabrador
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 9,247.00 (Claim Code 1)",
                    "2": "9,247.01 – 11,244.00 (Claim Code 2)",
                    "3": "11,244.01 – 13,241.00  (Claim Code 3)",
                    "4": "13,241.01 – 15,238.00  (Claim Code 4)",
                    "5": "15,238.01 – 17,235.00  (Claim Code 5)",
                    "6": "17,235,01 – 19,232.00 (Claim Code 6)",
                    "7": "19,232.01 – 21,229.00  (Claim Code 7)",
                    "8": "21,229.01 – 23,226.00 (Claim Code 8)",
                    "9": "23,226.01 – 25,223.00 (Claim Code 9)",
                    "10": "25,223.01 – 27,220.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)"
                }
            } else if (selectedPre == 'northwes') {
                //NorthwestTerritories
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 14,492.00 (Claim Code 1)",
                    "2": "14,492.01 – 16,984.00 (Claim Code 2)",
                    "3": "16,984.01 – 19,476.00 (Claim Code 3)",
                    "4": "19,476.01 – 21,968.00 (Claim Code 4)",
                    "5": "21,968.01 – 24,460.00 (Claim Code 5)",
                    "6": "24,460.01 – 26,952.00 (Claim Code 6)",
                    "7": "26,952.01 – 29,444.00 (Claim Code 7)",
                    "8": "29,444.01 – 31,936.00 (Claim Code 8)",
                    "9": "31,936.01 – 34,428.00 (Claim Code 9)",
                    "10": "34,428.01 – 36,920.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)",
                }
            } else if (selectedPre == 'nunavut') {
                //Nunavut
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 13,325.00 (Claim Code 1)",
                    "2": "13,325.01 – 15,857.00 (Claim Code 2)",
                    "3": "15,857.01 – 18,389.00 (Claim Code 3)",
                    "4": "18,389.01 – 20,921.00 (Claim Code 4)",
                    "5": "20,921.01 – 23,453.00  (Claim Code 5)",
                    "6": "23,453.01 – 25,985.00 (Claim Code 6)",
                    "7": "25,985.01 – 28,517.00 (Claim Code 7)",
                    "8": "28,517.01 – 31,049.00 (Claim Code 8)",
                    "9": "31,049.01 – 33,581.00 (Claim Code 9)",
                    "10": "33,581.01 – 36,113.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)"
                }
            } else if (selectedPre == 'ontario') {
                //Ontario
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 10,354.00 (Claim Code 1)",
                    "2": "10,354.01 – 12,585.00 (Claim Code 2)",
                    "3": "12,585.01 – 14,816.00 (Claim Code 3)",
                    "4": "14,816.01 – 17,047.00 (Claim Code 4)",
                    "5": "17,047.01 – 19,278.00 (Claim Code 5)",
                    "6": "19,278.01 – 21,509.00 (Claim Code 6)",
                    "7": "21,509.01 – 23,740.00 (Claim Code 7)",
                    "8": "23,740.01 – 25,971.00 (Claim Code 8)",
                    "9": "25,971.01 – 28,202.00 (Claim Code 9)",
                    "10": "28,202.01 – 30,433.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)"
                }
            } else if (selectedPre == 'prince_edward') {
                //PrinceEdwardIsland
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 7,708.00 (Claim Code 1)",
                    "2": "7,708.01 - 9,308.00 (Claim Code 2)",
                    "3": "9,308.01 - 10,908.00 (Claim Code 3)",
                    "4": "10,908.01 - 12,508.00 (Claim Code 4)",
                    "5": "12,508.01 - 14,108.00 (Claim Code 5)",
                    "6": "14,108.01 - 15,708.00 (Claim Code 6)",
                    "7": "15,708.01 - 17,308.00 (Claim Code 7)",
                    "8": "17,308.01 - 18,908.00 (Claim Code 8)",
                    "9": "18,908.01 - 20,508.00 (Claim Code 9)",
                    "10": "20,508.01 - 22,108.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)"
                }
            } else if (selectedPre == 'saskatchewan') {
                //Saskatchewan
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 15,639.00 (Claim Code 1)",
                    "2": "15,639.01 - 17,652.00 (Claim Code 2)",
                    "3": "17,652.01 - 19,665.00 (Claim Code 3)",
                    "4": "19,665.01 - 21,678.00 (Claim Code 4)",
                    "5": "21,678.01 - 23,691.00 (Claim Code 5)",
                    "6": "23,691.01 - 25,704.00 (Claim Code 6)",
                    "7": "25,704.01 - 27,717.00 (Claim Code 7)",
                    "8": "27,717.01 - 29,730.00 (Claim Code 8)",
                    "9": "29,730.01 - 31,743.00 (Claim Code 9)",
                    "10": "31,743.01 - 33,756.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)"
                }
            } else if (selectedPre == 'yukon') {
                //Yukon
                list = {
                    "0": "No Claim Amount (Claim Code 0)",
                    "1": "Minimum - 11,327.00 (Claim Code 1)",
                    "2": "11,327.01 - 13,491.00 (Claim Code 2)",
                    "3": "13,491.01 - 15,655.00 (Claim Code 3)",
                    "4": "15,655.01 - 17,819.00 (Claim Code 4)",
                    "5": "17,819.01 - 19,983.00 (Claim Code 5)",
                    "6": "19,983.01 - 22,147.00 (Claim Code 6)",
                    "7": "22,147.01 - 24,311.00 (Claim Code 7)",
                    "8": "24,311.01 - 26,475.00 (Claim Code 8)",
                    "9": "26,475.01 - 28,639.00 (Claim Code 9)",
                    "10": "28,639.01 - 30,803.00 (Claim Code 10)",
                    "11": "No Tax (Claim Code E)"
                }
            }
            console.log(list);
            $.each(list, function (key, value) {
                claimCodePro.append($("<option></option>")
                        .attr("value", key)
                        .text(value));
            });
        }

//        if (currentIndex === 3) { //if last step
//            //remove default #finish button
//            $('#wizard').find('a[href="#finish"]').remove(); 
//            //append a submit type button
//            $('#wizard .actions li:last-child').append('<button type="submit" id="submit" class="btn-large"><span class="fa fa-chevron-right"></span></button>');
//        }

        form.validate().settings.ignore = ":disabled,:hidden";
        return form.valid();
    },
    onFinishing: function (event, currentIndex)
    {
        form.validate().settings.ignore = ":disabled";
        return form.valid();
    },
    onFinished: function (event, currentIndex)
    {

        $('#response').html('<div class="alert success border-radius"><i class="fa fa-lg fa-check-circle-o"></i>  Hi! Thank you for your complete data, please click Submit<br><br><div class="col-lg-3 mx-auto"><button class="btn btn-primary btn-xl text-center" type="submit" form="salary" value="Submit">Submit</button></div></div>');
        form.each(function () {
            this.reset;
        });
        $('.wizard > .actions').hide(300);

//        window.location.href = "result.jsp";

        $.ajax({
            url: form.attr('action'),
            data: form.serilize(), //form data
            type: form.attr('method'),

            beforeSend: function (xhr) {
                
            },
            complete: function (xher) {

            },
            success: function (data) {
                var myObj = form.serilize();
                var json = JSON.stringify(myObj);
                var fs = require('fs');
                fs.writeFile('data.json', json, 'utf8', callback);
                
                console.log(form.serilize());
            }
        });


    }
});

/*
 $('.checkbox').on('click',function () {
 var ckbox = $('.checkbox input');
 if (ckbox.is(':checked')) {
 console.log('Hi Me');
 alert('Checked it');
 $('.show-me-if-checked').show(300);
 } else {
 
 }
 });
 */

$('#taxableBenefits').change(function () {
    $('#myTaxableBenefits').toggle();
});

$('#contribEmployerRrsp').change(function () {
    $('#mycontribEmployerRrsp').toggle();
});

$('#contribRRSPorRPP').change(function () {
    $('#mycontribRRSPorRPP').toggle();
});

$('#unionDues').change(function () {
    $('#myUnionDues').toggle();
});

$('#deductionsLiving').change(function () {
    $('#myDeductionsLiving').toggle();
});

$('#otherDeductions').change(function () {
    $('#myOtherDeductions').toggle();
});

$('#alimonyOrMaintenancePayment').change(function () {
    $('#myAlimonyorMaintenancePayment').toggle();
});

