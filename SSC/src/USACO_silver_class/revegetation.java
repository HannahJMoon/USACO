package USACO_silver_class;

public class revegetation {
	
	

	public static void main(String[] args) {
		
		
		
	}
/*
static int N = 0;
static int M  = 0;
static int answer = 0;
static int L = new int [100001];
vector<int> S_nbrs[100001], D_nbrs[100001];
boolean impossible = false;
 
public static void visit (int x, int v)
{
  L[x] = v;
  for (auto n : S_nbrs[x]) {
    if (L[n] == 3-v) impossible = true; 
    if (L[n] == 0) visit(n, v);
  }
  for (auto n : D_nbrs[x]) {
    if (L[n] == v) impossible = true; 
    if (L[n] == 0) visit(n, 3-v);
  }  
}
 
int main(void)
{
  ifstream fin ("revegetate.in");
  fin >> N >> M;
  for (int i=0; i<M; i++) {
    int a, b;
    string s;
    fin >> s >> a >> b;
    if (s=="S") { S_nbrs[a].push_back(b); S_nbrs[b].push_back(a); }
    if (s=="D") { D_nbrs[a].push_back(b); D_nbrs[b].push_back(a); }
  }
 
  for (int i=1; i<=N; i++) 
    if (!L[i]) { visit(i,1); answer++; }
  
  ofstream fout ("revegetate.out");
  if (impossible) fout << "0\n";
  else {
    fout << "1";
    for (int i=0; i<answer; i++) fout << "0";
    fout << "\n";
  }
  return 0;
}
 */
}
