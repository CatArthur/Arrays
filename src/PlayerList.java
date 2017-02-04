import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by student1 on 04.02.17.
 */
public class PlayerList {
    List<Player> players=new List<Player>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Player> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Player player) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Player> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Player> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Player get(int index) {
            return null;
        }

        @Override
        public Player set(int index, Player element) {
            return null;
        }

        @Override
        public void add(int index, Player element) {

        }

        @Override
        public Player remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Player> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Player> listIterator(int index) {
            return null;
        }

        @Override
        public List<Player> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    public void setName(String n){
        for (int i = 0; i < players.size(); i++) {
            if(players[i].getName.equals(n))


        }
    }
}
