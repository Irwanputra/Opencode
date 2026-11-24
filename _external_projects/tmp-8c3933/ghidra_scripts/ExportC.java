//@category Export
import ghidra.app.script.GhidraScript;
import ghidra.app.decompiler.*;
import ghidra.util.task.*;
import ghidra.program.model.listing.*;
import java.io.*;
public class ExportC extends GhidraScript {
  @Override
  public void run() throws Exception {
    DecompInterface di = new DecompInterface();
    di.openProgram(currentProgram);
    String od = System.getenv().getOrDefault("OUTDIR","/tmp/ghidra_out"); File out = new File(od);
    out.mkdirs();
    int n=0;
    for (Function f : currentProgram.getFunctionManager().getFunctions(true)) {
      try {
        DecompileResults r = di.decompileFunction(f, 60, new ConsoleTaskMonitor());
        if (r.decompileCompleted()) {
          String name = f.getName().replaceAll("[^A-Za-z0-9_]","_");
          String addr = f.getEntryPoint().toString().replaceAll("[^A-Za-z0-9_]","_");
          try (PrintWriter pw = new PrintWriter(new File(out, addr+"_"+name+".c"))) {
            pw.println("// " + f.getEntryPoint() + " " + f.getName());
            pw.println(r.getDecompiledFunction().getC());
          }
          n++;
        }
      } catch (Exception e) { println("err "+f.getName()+": "+e); }
    }
    println("exported "+n+" functions");
  }
}
