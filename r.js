
function myfunc(event){

    event.preventDefault();

    var Name1 = document.getElementById('Name').value;

    var email1 = document.getElementById('email').value;

    var Number1 = document.getElementById('number').value;

    var date1 = document.getElementById('date').value;

    var time1 = document.getElementById('appt').value;



    localStorage.setItem('name',Name1);

    localStorage.setItem('email',email1);

    localStorage.setItem('number',Number1);

    localStorage.setItem('date',date1);

    localStorage.setItem('time',time1);



}
logic

so whenever we want to store data , we always have to options we can store it on localstorage, session storage

in local storage 
localstorage.setItem() to set data in local

logic behind storing data in local strage is it is significantly  times fatser an other storage ..and accessing data saves lot of time, Api request consumed very less time ...one in all every become easy and fast, comapnies like filpkart uses then process to store data local storage.
