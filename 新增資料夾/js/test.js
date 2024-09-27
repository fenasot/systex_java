"use strict";
function bulldName(firstName, ...restOfName) {
    return `${firstName} ${restOfName.join(" ")}`;
}
let b = bulldName;
let c = bulldName;
console.log(b("bob"));
console.log(b("11", "aa", "4242sf", "rggds"));
