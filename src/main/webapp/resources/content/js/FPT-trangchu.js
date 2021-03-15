

function dropCardContain(){
    click+=1;
    if (click == 1) {
        document.getElementById("card-container").style.marginTop = "1rem";
    }
    else {
        document.getElementById("card-container").style.marginTop = "-8rem";
    }
}
function bodySectionClick(){
    if (click == 1) {
        document.getElementById("card-container").style.marginTop = "1rem";
    }
    else {
        document.getElementById("card-container").style.marginTop = "-8rem";
    }
    click=0;
}

window.addEventListener("scroll",()=>{
    const value = window.scrollY;
   if(value>100){
       document.getElementById("navbar3").style.opacity="1";
       document.getElementById("navbar3").style.height = "10%";
       document.getElementById("navbar3").style.zIndex = "3";
   }
   else{
       document.getElementById("navbar3").style.opacity = "0";
       document.getElementById("navbar3").style.height = "0";
   }
});


var xhr = new XMLHttpRequest();
xhr.open("GET","https://vapi.vnappmob.com/api/province/","true");
xhr.send();
xhr.onload = () => {
    if(xhr.status ===200){
        var data =(JSON.parse(xhr.responseText)).results;
        // console.log(data.results[0].province_name);
        for(var i in data){
            var item = document.createElement("a");
            item.id = data[i].province_id;
            item.className="choiceItemTT";
            item.innerHTML = data[i].province_name;
            var list =document.getElementById("dropdown-TT");
            list.appendChild(item);
        }
    }
}

var drop1 =document.getElementById("dropdown-TT");



drop1.addEventListener("click",selectItemTT);
function selectItemTT(e){
    if (e.target.classList.contains('choiceItemTT')){
        var list = document.getElementById("dropdown-QH");
       
        document.getElementById("btn-tinh").innerHTML=e.target.innerHTML;
        var xhr = new XMLHttpRequest();
        xhr.open("GET", "https://vapi.vnappmob.com/api/province/district/" + e.target.id, "true");
        xhr.send();
       
        
        xhr.onload = () => {
            if (xhr.status === 200) {
                var data = (JSON.parse(xhr.responseText)).results;
                var contain = '';
                for (var i in data) {
                    contain += "<a class='choiceItemQH' >" + data[i].district_name+"</a>";
                }
                document.getElementById("dropdown-QH").innerHTML = contain;
            }
        }
        var drop2 = document.getElementById("dropdown-QH");


        drop2.addEventListener("click", selectItemQH);

        function selectItemQH(e) {
            if (e.target.classList.contains("choiceItemQH")) {
                document.getElementById("btn-huyen").innerHTML = e.target.innerHTML;

            }
        }

    }
}






