"use strict";
let deck = {
    suits: ["hearts", "soades", "clubs", "diamonds"],
    cards: Array(52),
    createCardPicker: function () {
        // let self = this;
        return () => {
            let pickedCard = Math.floor(Math.random() * 52);
            let pickedSuit = Math.floor(pickedCard / 13);
            return { suit: this.suits[pickedSuit], card: pickedCard % 13 };
        };
    }
};
console.log(deck.createCardPicker());
