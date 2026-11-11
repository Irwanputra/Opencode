.class public abstract Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;
.super Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "L\u3065\u3056\u304b\u3079\u3079/\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3073\u3050\u3073\u3042\u3073;"
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/app/Activity;

.field public final くし〴〺ぅ:Landroid/content/Context;

.field public final づざかべべ:I

.field public final なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

.field public final びぐびあび:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .registers 4

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1
    invoke-direct {p0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/びぐびあび;-><init>()V

    new-instance v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-direct {v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;-><init>()V

    iput-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->〺つふすそ:Landroid/app/Activity;

    const-string v1, "context == null"

    invoke-static {p1, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺぁあねじ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:Landroid/content/Context;

    const-string p1, "handler == null"

    invoke-static {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ぺぁあねじ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->びぐびあび:Landroid/os/Handler;

    const/4 p1, 0x0

    iput p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぁごぐすすぃ;->づざかべべ:I

    return-void
.end method


# virtual methods
.method public abstract 〳ぜぞぜべっ()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation
.end method

.method public abstract ぁごぐすすぃ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
.end method

.method public abstract いいにぽつ()I
.end method

.method public abstract ぇぬぎばつ()V
.end method

.method public abstract おぐぴう〸ず(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .param p2    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
.end method

.method public abstract てぜきぽく(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V
.end method

.method public abstract のぷのちつ(Landroidx/fragment/app/Fragment;)Z
.end method

.method public abstract びぐびあび(Landroidx/fragment/app/Fragment;)V
.end method

.method public abstract へぬ〴づぞ(Ljava/lang/String;)Z
.end method

.method public abstract ぺぁあねじ()Landroid/view/LayoutInflater;
.end method

.method public abstract ぺふねづ〺()Z
.end method
