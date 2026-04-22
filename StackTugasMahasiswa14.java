public class StackTugasMahasiswa14{

    Mahasiswa14 [] stack;
    int top;
    int size;

    public StackTugasMahasiswa14(int size){
        this.size = size;
        stack = new Mahasiswa14[size];
        top = -1;
    }
    public boolean isFull(){
        if(top == size -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpety(){
        if (top == -1){
            return true;
        }else{
            return false;   
        }
    }
    public void push(Mahasiswa14 mhs){
        if(!isFull()){
            top++;
            stack[top]=mhs;
        }else{
            System.out.println("Stack Penuh, Tidak bisa menambahkan tugas lagi");
        }
    }
    public Mahasiswa14 pop(){
        if (!isEmpety()) {
            Mahasiswa14 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack Kosong, Tidak ada tugas untuk dinilai");
            return null;
        }
    }
    public Mahasiswa14 peek(){
        if (!isEmpety()) {
            return stack[top];
        }else{
            System.out.println("Stack Kososng! Tidak ada Tugas yang dikumpulkan");
            return null;
        }
        
    }
    public void print(){
        if (!isEmpety()) {
            for(int i=0; i<= top; i++){
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        }else{
            System.out.println("Stack Kosong");
        }
        System.out.println("");
    }
    
    public Mahasiswa14 peekBawah(){
        if (!isEmpety()) {
            return stack[0];
        }else{
            System.out.println("Stack kosong");
            return null;
        }
    }

    public int jumtugas(){
        return top + 1;
    }

    public String konversiDesimalKeBinner (int nilai){
        StackKonversi14 stack = new StackKonversi14();

        while (nilai != 0) {
            int sisa = nilai %2;
            stack.push(sisa);
            nilai = nilai/2;
        }
        String binner = new String();
        while (!stack.isEmpty()) {
            binner += stack.pop();
        }
        return binner;
    }
}