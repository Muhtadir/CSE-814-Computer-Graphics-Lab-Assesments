	
	/***************************************************************
	*															   *
	*			Md. Muhtadir Rahman								   *
	*			Id: 1607046										   *
	*			Session : 2015-2016								   *
	*			Department of Computer Science & Engineering,	   *
	*			University of Chittagong.						   *
	*															   *
	***************************************************************/

function myFunction() {

	var canvas = document.getElementById("myCanvas")
	var val = document.getElementById("frm1");
	var a = val.elements["x_axis"].value;
	var b = val.elements["y_axis"].value;	
	var margin = 80;
	var x = Number(a) + margin;
	var y = Number(b) + margin;
	rectangle(canvas,x,y,margin);
	circle(canvas,x,y,margin);
	lineDraw(canvas,x,y,margin);	

}
function rectangle(canvas,x,y, margin){
	contextRectangle = canvas.getContext("2d");
    contextRectangle.rect(margin,margin,x,y);
	contextRectangle.stroke();
	
}
function circle(canvas,x,y,margin){
	//var hypotanuse = Math.sqrt((x**2)+(y**2));
	var radius;
	if(x>y){
		radius = y/3;
	}
	if(x<y){
		radius = x/3;
	}
	if(x==y){
		radius = x/3;
	}
	contextCircle = canvas.getContext("2d");
	contextCircle.beginPath();
	contextCircle.arc((x/2)+margin,(y/2)+margin,radius,0,2*Math.PI);
	//contextCircle.arc((x/2)+margin,(y/2)+margin,hypotanuse/4,0,2*Math.PI);
	contextCircle.stroke();
}

function lineDraw(canvas,x,y,margin){
	contextLine = canvas.getContext("2d");
	contextLine.moveTo(margin, margin);
	contextLine.lineTo(x+margin, y+margin);
	contextLine.stroke();
	contextLine.moveTo(margin, y+margin);
	contextLine.lineTo(x+margin, margin);
	contextLine.stroke();
	contextLine.moveTo(margin, (y/2)+margin);
	contextLine.lineTo(x+margin, (y/2)+margin);
	contextLine.stroke();
	contextLine.moveTo((x/2)+margin, margin);
	contextLine.lineTo((x/2)+margin, y+margin);
	contextLine.stroke();
}