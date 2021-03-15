var click = 0;
function myFunction() {
    click += 1;
    if (click % 2 == 0) {
        var link = document.getElementsByClassName("bg-left")[0];
        link.style.right = "0";
        document.getElementById("bg-left").style.left = "50%";
    }
    else {
        var link = document.getElementsByClassName("bg-left")[0];
        link.style.right = "50%";
        document.getElementById("bg-left").style.left = "0";
    }
    console.log(click);
}

var button = document.getElementById("dk->dn").addEventListener("click", myFunction);

var button = document.getElementById("dn->dk").addEventListener("click", myFunction);

