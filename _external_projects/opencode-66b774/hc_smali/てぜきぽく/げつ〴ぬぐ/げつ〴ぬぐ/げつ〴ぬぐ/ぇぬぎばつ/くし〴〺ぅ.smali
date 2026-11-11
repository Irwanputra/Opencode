.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic 〺つふすそ:Ljava/io/File;

.field public final synthetic くし〴〺ぅ:[Ljava/io/File;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/widgets/FileChooser;Ljava/io/File;[Ljava/io/File;)V
    .registers 4

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Ljava/io/File;

    iput-object p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 4

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Ljava/io/File;

    iget-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/io/File;

    const/4 v0, 0x0

    aget-object p2, p2, v0

    invoke-static {p1, p2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/ぺぁあねじ;->げつ〴ぬぐ(Ljava/io/File;Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_13

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    goto :goto_19

    :cond_13
    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->くし〴〺ぅ:[Ljava/io/File;

    iget-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/くし〴〺ぅ;->〺つふすそ:Ljava/io/File;

    aput-object p2, p1, v0

    :goto_19
    return-void
.end method
