public class Dealer {

    public void dealerCard(Deck deck, Player player) {
        PlayingCard card = deck.dealCard();
        player.addCardToHand(card);
    }

}
