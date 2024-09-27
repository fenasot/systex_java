function bulldName(firstName: string, ...restOfName: string[]) {
    return `${firstName} ${restOfName.join(" ")}`;
}

let b:(firstName: string, ...rest:string[]) => string = bulldName;
let c = bulldName;

console.log(b("bob"));
console.log(b("11","aa","4242sf","rggds"));
