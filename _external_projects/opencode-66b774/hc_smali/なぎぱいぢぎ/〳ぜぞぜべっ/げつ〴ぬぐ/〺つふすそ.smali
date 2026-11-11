.class public Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Z

.field public final げつ〴ぬぐ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;->〺つふすそ:Z

    iput-object p1, p0, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/lang/String;)Z
    .registers 9

    invoke-static {}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_7
    if-ge v2, v1, :cond_32

    aget-object v4, v0, v2

    invoke-static {v4, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_2f

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " binary detected!"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lなぎぱいぢぎ/〳ぜぞぜべっ/げつ〴ぬぐ/くし〴〺ぅ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/Object;)V

    const/4 v3, 0x1

    :cond_2f
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_32
    return v3
.end method
