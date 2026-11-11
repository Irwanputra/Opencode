.class public Lteam/dev/epro/apkcustom/MainActivity$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/MainActivity;->ながふずは()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/MainActivity;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/MainActivity$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 3

    new-instance p1, Landroid/content/Intent;

    const-string p2, "L4oA6lLef\u001ajj@7=I1lLg;@bj\u001e1<Lbk\u001c4i\u001d0k\u001bjgO6iIf=K4>\u001dbnI4oH49O6fOg<O"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p2, "IgjO3=JgkOgfJ1j@fhKkkNfn@j9Hef\u001ag9Lgg\u001ak=J1o\u001e7k\u0019giAg;Hc>\u001dcjAj9A6:L"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object p2, p0, Lteam/dev/epro/apkcustom/MainActivity$くし〴〺ぅ;->〺つふすそ:Lteam/dev/epro/apkcustom/MainActivity;

    invoke-virtual {p2, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
