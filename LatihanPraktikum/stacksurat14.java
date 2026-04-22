package LatihanPraktikum;

public class stacksurat14 {
    
    Surat14 stack [];
    int top;
    int size;

    public stacksurat14(int size){
        this.size = size;
        stack = new Surat14[size];
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
    public void push(Surat14 srt){
        if(!isFull()){
            top++;
            stack[top]=srt;
        }else{
            System.out.println("Stack Penuh, Tidak bisa menambahkan surat lagi");
        }
    }
    public Surat14 pop(){
        if (!isEmpety()) {
            Surat14 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack Kosong, Tidak ada surat untuk diproses");
            return null;
        }
    }
    public Surat14 peek(){
        if (!isEmpety()) {
            return stack[top];
        }else{
            System.out.println("Stack Kososng! Tidak ada Tugas yang dikumpulkan");
            return null;
        }
        
    }
    
    public Surat14 cariNama(String nama){
    for (int i = 0; i <= top; i++) {
        if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
            return stack[i];
        }
    }
    return null;
}
}
