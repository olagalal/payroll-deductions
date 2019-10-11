// Validation Using JQuery Library
$(document).ready(function () {
    $('#first_form').validate({
        rules: {
            province: {
                required: true
            },
            payPeriod: {
                required: true
            }
        }
    });

    $('#step2').validate({
        rules: {
            income: {
                required: true,
                number: true
            }
        }
    });

    $('#step3').validate({
        rules: {

        }

    });
});