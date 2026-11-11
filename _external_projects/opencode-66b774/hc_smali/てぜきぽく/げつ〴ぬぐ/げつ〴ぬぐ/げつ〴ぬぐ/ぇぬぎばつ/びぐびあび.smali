.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic 〺つふすそ:[Ljava/io/File;

.field public final synthetic くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/FileChooser;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/widgets/FileChooser;[Ljava/io/File;)V
    .registers 3

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/FileChooser;

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;->〺つふすそ:[Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .registers 5

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/widgets/FileChooser;

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;->〺つふすそ:[Ljava/io/File;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/びぐびあび;->〺つふすそ:[Ljava/io/File;

    aget-object v1, v2, v1

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    .line 1
    sget v2, Lteam/dev/epro/apkcustom/widgets/FileChooser;->なぎぱいぢぎ:I

    invoke-virtual {p1, v0, v1}, Lteam/dev/epro/apkcustom/widgets/FileChooser;->げつ〴ぬぐ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
