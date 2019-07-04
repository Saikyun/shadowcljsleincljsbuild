# shadowcljsleincljsbuild

How to test:
```
git clone https://github.com/Saikyun/shadowcljsleincljsbuild
cd shadowcljsleincljsbuild
npm install
lein deps
npm install -g shadow-cljs
lein cljsbuild once
shadow-cljs compile :app
```
Then you can run:
```
node js/main.js
```
Which gives:
```
goog.provide('my.caal');
goog.require('cljs.core');
my.caal.yo = (function my$caal$yo(x){
return (x + x);
});
((1) + (1));
```
Whereas shadow-cljs:
```
node js/shadow-main.js
```
Gives:
```
WARNING: Use of undeclared Var my.caal/defn at line 1 
WARNING: Use of undeclared Var my.caal/yo at line 1 
WARNING: Use of undeclared Var my.caal/x at line 1 
WARNING: Use of undeclared Var my.caal/+ at line 1 
WARNING: Use of undeclared Var my.caal/x at line 1 
WARNING: Use of undeclared Var my.caal/x at line 1 
WARNING: Use of undeclared Var my.caal/+ at line 1 
goog.provide('my.caal');
goog.require('cljs.core');
my.caal.defn.call(null,my.caal.yo,new cljs.core.PersistentVector(null, 1, 5, cljs.core.PersistentVector.EMPTY_NODE, [my.caal.x], null),my.caal._PLUS_.call(null,my.caal.x,my.caal.x));
my.caal._PLUS_.call(null,(1),(1));
```
