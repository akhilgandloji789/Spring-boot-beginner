let isJohn = true;

function toggleUser() {

    const image = document.getElementById("profileImage");
    const name = document.getElementById("userName");
    const gender = document.getElementById("gender");

    if (isJohn) {
        image.src = "/images/jane.png";
        name.innerText = "Jane Doe";
        gender.innerText = "Female";
    } else {
        image.src = "/images/john.png";
        name.innerText = "John Doe";
        gender.innerText = "Male";
    }

    isJohn = !isJohn;
}