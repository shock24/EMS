function add_to_cart(pid,pname,price)
{
	let cart=localStorage.getItem("cart");
	if(cart==null)
		{
			// no cart yet
			let products=[];
			let product={productId: pid, productName: pname, productQuantity: 1, productPrice: price};
			products.push(product);
			localStorage.setItem("cart", JSON.stringify(products));
			//console.log("Product is added for the first time");
			showToast("Item is added to cart");
		}
	else
		{
			// cart already present
		
			let pcart=JSON.parse(cart);
			
			let oldProduct=pcart.find((item)=> item.productId == pid )
			
			if(oldProduct)
			{
				//we have to increase the quantity
				oldProduct.productQuantity += 1;
				pcart.map((item) => {
					
					if(item.productId == oldProduct.productId)
					{
						item.productQuantity = oldProduct.productQuantity;
					}
				})
				localStorage.setItem("cart", JSON.stringify(pcart));
				//console.log("Product quantity is increased");
				showToast(oldProduct.productName+" quantity is increased, Quantity = "+oldProduct.productQuantity);
			}
			else
			{
				//we have to add the product
				let product={productId: pid, productName: pname, productQuantity: 1, productPrice: price};
				pcart.push(product);
				localStorage.setItem("cart", JSON.stringify(pcart));
				//console.log("Product is added");
				showToast("Product is added to cart");
			}
		}
	updateCart();

}


//update cart
function updateCart()
{
	let cartString = localStorage.getItem("cart");
	let cart = JSON.parse(cartString);
	if(cart==null || cart.length==0)
	{
		console.log("cart is empty!!");
		$(".cart-items").html("( 0 )");
		$(".cart-body").html("<h3>There are no items in the cart</h3>");
		$(".checkout-btn").attr("disabled",true);
	}
	else{
		//there is something in the cart to show
		console.log(cart);
		$(".checkout-btn").attr("disabled", false);
		$(".cart-items").html(`( ${cart.length} )`)
		let table=`
			<table class='table'>
			<thead class='thead-light'>
				<tr>
				<th>Item Name</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Total Price</th>
				<th>Action</th>
				</tr>
		`;
		
		let totalPrice=0;
		cart.map((item)=> {
			
			let pPrice=(item.productQuantity * item.productPrice);
			table += `
				<tr>
					<td>${item.productName}</td>
					<td>${item.productPrice}</td>
					<td>${item.productQuantity}</td>
					<td>${pPrice}</td>
					<td><button onclick="deleteItemFromCart(${item.productId})" class="btn btn-danger btn-sm">Remove</button></td>
				
				</tr>
			`;
			totalPrice += pPrice;
		})
		
		
		table=table+`
			<tr><td colspan='5' class="text-right font-weight-bold">Total Price : ${totalPrice}</td></tr>
			</table>`;
		$(".cart-body").html(table); 
	}
	

}

//delete item from cart
function deleteItemFromCart(pid){
	console.log(pid);
	let cart=JSON.parse(localStorage.getItem('cart'));
	
	let newCart=cart.filter((item)=> item.productId != pid);
	
	localStorage.setItem('cart',JSON.stringify(newCart));
	
	updateCart();
	
	showToast("Item is removed from cart");
}


//jaise hi page load ho jayega waise hi cart me values update ho jayengi
$(document).ready(function(){
	updateCart();
});


//toast function
function showToast(content){
    $('#toast').addClass('display');
    $('#toast').html(content);

    setTimeout(()=>{
        $('#toast').removeClass('display');
    } , 2000);
}

//checkout function
function goToCheckout(){
	window.location = "checkout.jsp";
}