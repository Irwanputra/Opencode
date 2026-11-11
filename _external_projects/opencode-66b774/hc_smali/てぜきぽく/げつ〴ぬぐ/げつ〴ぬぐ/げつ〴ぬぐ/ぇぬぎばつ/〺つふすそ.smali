.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic 〺つふすそ:[Ljava/io/File;

.field public final synthetic くし〴〺ぅ:Ljava/io/File;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/widgets/FileChooser;[Ljava/io/File;Ljava/io/File;)V
    .registers 4

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〺つふすそ;->〺つふすそ:[Ljava/io/File;

    iput-object p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〺つふすそ;->くし〴〺ぅ:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 5

    iget-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〺つふすそ;->〺つふすそ:[Ljava/io/File;

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/〺つふすそ;->くし〴〺ぅ:Ljava/io/File;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
