public class ArvoreAVL {
    private class No{
        public int dado,hEsq,hDir;
        public No esq,dir;
    }
    public No root = null;//inicia vazio

    public No inserirH(No p, int info) {
        if (p == null) { //nó inserido sempre será nó folha
            p=new No();
            p.dado = info;
            p.esq = null;
            p.dir = null;
            p.hDir=0;
            p.hEsq=0;
        }
        else if (info < p.dado){
            p.esq= inserirH (p.esq, info);
            if (p.esq.hDir > p.esq.hEsq) //Altura do nó será a maior
                p.hEsq = p.esq.hDir + 1; //altura dos seus filhos
            else
                p.hEsq = p.esq.hEsq + 1;
        }
        else {
            p.dir=inserirH(p.dir, info);
            if (p.dir.hDir > p.dir.hEsq)
                p.hDir = p.dir.hDir + 1;
            else
                p.hDir = p.dir.hEsq + 1;
        }
        return p;
    }

}
