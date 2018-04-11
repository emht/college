function cal_interest() {
    var principal = parseInt(document.getElementById('principal').value);
    var rate = parseFloat(document.getElementById('rate').value);
    var months = parseInt(document.getElementById('months').value);

    var final_interest = parseFloat((principal * rate * months) / 100);
    document.getElementById('simple_interest').innerHTML="Total amount after interest is: " + final_interest;
}

function validate_form() {
    if (document.forms["contact_form"]["firstname"].value == "" ) {
        alert("Please provide your Name!");
        return false;
    }
    if (document.forms["contact_form"]["email"].value == "") {
        alert("Please provide your email address to procceed!");
        return false;
    }
    if (document.forms["contact_form"]["message"].value == "") {
        alert("You cannot leave the message empty!");
        return false;
    }
}