function cal_interest() {
    var principal = parseInt(document.getElementById('principal').value);
    var rate = parseFloat(document.getElementById('rate').value);
    var months = parseInt(document.getElementById('months').value);

    var final_interest = parseFloat((principal * rate * months) / 100);
    document.getElementById('simple_interest').innerHTML="Total amount after interest is: " + final_interest;
}