package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.hashCode;

public class hashCodeSample {

    class Card {
        private String rank;
        private String suit;

        public Card(String r, String s) {
            if (r == null || s == null)
                throw new IllegalArgumentException();
            rank = r;
            suit = s;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Card)) return false;
            Card c = (Card) obj;
            return rank.equals(c.rank) && suit.equals(c.suit);
        }

        @Override
        public int hashCode() {
            return rank.hashCode() + 7 * suit.hashCode();
        }
    }
}
