class Greeter {
    greeting: string

    constructor(message: string) {
        this.greeting = message;
    }

    greet() {
        return `hello ${this.greeting}`;
    }
}

let a = new Greeter("aa");
console.log(a.greet());

// class Animal {
//     name: string;
//     constructor(theName: string) {
//         this.name = theName;
//     }

//     move(distanceTnMeters: number = 0) {
//         console.log(`${this.name} move ${distanceTnMeters}`);
//     }
//  }

//  class Snake extends Animal {
//     constructor(name: string) {
//         super(name);
//     }

//     move(distanceTnMeters: number = 5):void {
//         console.log("Slitering...");
//         super.move(distanceTnMeters);
//     }
//  }

//  let sam:Animal = new Snake("Sammy the Python");
//  sam.move(10)

