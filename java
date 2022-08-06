var form = document.getElementById('addForm');
var itemList = document.getElementById('items');

//Form Submit event
form.addEventListener('submit', addItem);
// add event 
function addItem(e){
    e.preventDefault();


// get input value
    var newItem = document.getElementById('item').value;

//Create new li element
    var li = document.createElement('li');
    //add class name//
    li.className = 'list-group-item';
    //add text node 
    li.appendChild(document.createElement(newItem));
    //create the delete button element
    var deletebtn = document.createElement('button');
    var savebnt = document.createElement('button');
     //add classes to del button;
    deletebtn.className = 'btn btn-danger btn-sm float-right delete';
    //append text node
    deletebtn.appendChild(document.createElement('x'));
    savebnt.appendChild(document.createElement('S'));
    
    //append to li//
    li.appendChild(deletebtn);
    li.appendChild(savebnt);


    // append li to list//
    itemList.appendChild(li);



}




