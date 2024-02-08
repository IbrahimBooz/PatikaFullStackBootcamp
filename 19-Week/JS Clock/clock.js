//function that gets name information from the user

function newName() {
  const firstName = prompt("What's your Name?");
  document.querySelector("#myName").innerHTML = firstName;
  // document.getElementById('myName').innerHTML=firstName
}

function myTime() {
  const daysOfWeek = [
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
  ];

  //we used the new Date() method to write the current date in the desired format
  const date = new Date();
  const day = daysOfWeek[date.getDay()];
  const minute = date.getMinutes();
  const hour = date.getHours();
  const second = (date.getSeconds());
  const time = `${hour}:${minute}:${second} ${day}`;

  document.querySelector("#myClock").innerHTML = time;
  setInterval(myTime, 1000);
}

newName();
myTime();
