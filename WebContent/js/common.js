// 小屏幕适配 
window.onload=function(){
	console.log(document.body.clientWidth )
	if (document.body.clientWidth<=320) {
      	console.warn("小屏 true")
		var meta = document.getElementsByTagName('meta');
	    for(var i=0;i<meta.length;i++){
	      if (meta[i].getAttribute('name')=="viewport") {
	      	console.warn( "测试："+ meta[i].getAttribute('name')+'\n'+meta[i].getAttribute('content'));
	      	meta[i].setAttribute('content',"width=device-width, initial-scale=0.8,maximum-scale=1,user-scalable=no");
	      }
	    }
	}else{
      	console.warn("小屏 false")
	}
	
}