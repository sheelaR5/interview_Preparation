let selectedVehicleId = null;

function bookVehicle(id, name){

    selectedVehicleId = id;

    document.getElementById("bookingForm").style.display = "block";

    alert("Selected Vehicle: " + name);

}

function submitBooking(){

    const booking = {

        customer:{
            name:document.getElementById("customerName").value,
            email:document.getElementById("customerEmail").value,
            phone:document.getElementById("customerPhone").value
        },

        vehicle:{
            id:selectedVehicleId
        },

        bookingDate:document.getElementById("bookingDate").value

    };

    fetch("http://localhost:8080/bookings",{

        method:"POST",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify(booking)

    })
    .then(response=>response.json())
    .then(data=>{

        alert("Booking Successful!");

        document.getElementById("bookingForm").style.display="none";

    })
    .catch(error=>{

        alert("Booking Failed");

    });

}