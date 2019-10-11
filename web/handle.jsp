<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="errorPage.jsp"%>

<jsp:useBean id = "tax" scope = "session" class= "Model.Calculations"></jsp:useBean>

<jsp:useBean id = "res" scope = "session" class= "Database.Results"></jsp:useBean>

    <!DOCTYPE html>

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>

        <%
            tax.setName(request.getParameter("name"));
            tax.setProvince(request.getParameter("province"));
            tax.setI(Double.parseDouble(request.getParameter("income")));

            tax.setEmployerRrsp(Double.parseDouble(request.getParameter("EmployerRrsp")));

            tax.setF(Double.parseDouble(request.getParameter("RRSP"))
                    + Double.parseDouble(request.getParameter("RPP"))
                    + Double.parseDouble(request.getParameter("PRPP")));

            tax.setU1(Double.parseDouble(request.getParameter("ud")));
            tax.setF1(Double.parseDouble(request.getParameter("deduction")));
            tax.setF2(Double.parseDouble(request.getParameter("mp")));
            tax.setHd(Double.parseDouble(request.getParameter("pz")));
            tax.setL(Double.parseDouble(request.getParameter("nameTD1")));
            tax.setP(Integer.parseInt(request.getParameter("payPeriod")));
            if (request.getParameter("yearToDateCPP").equals("1")) {
                tax.setC(2593.80);
            } else if (request.getParameter("yearToDateCPP").equals("2")) {
                tax.setC(0);
            } else if (request.getParameter("yearToDateCPP").equals("0")) {
                tax.setC(tax.getI() * 0.0495);
            }

            if (request.getParameter("yearToDateEI").equals("1")) {
                tax.setEi(858.22);
            } else if (request.getParameter("yearToDateEI").equals("2")) {
                tax.setEi(0);
            } else if (request.getParameter("yearToDateEI").equals("0")) {
                tax.setEi(tax.getI() * 0.0166);
            }

            tax.setCc(Integer.parseInt(request.getParameter("claimCodeFed")));
            tax.setCp(Integer.parseInt(request.getParameter("claimCodePro")));

            tax.calculate();

            res.search();

            response.sendRedirect("result.jsp");

        %>
        <!--form action="result.jsp">

        <%= tax.getEmployerRrsp()%> <br>
        <%= tax.getT()%><br>
        <%= tax.getT1()%><br>
        <%= tax.getT2()%><br>
        <%= tax.getA()%><br>


        <input type="submit">
    </form-->
    </body>
</html>
