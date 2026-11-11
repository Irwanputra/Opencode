.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public 〺つふすそ:Landroid/app/Activity;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/げつ〴ぬぐ;

.field public げつ〴ぬぐ:Landroid/content/Context;

.field public づざかべべ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public なぎぱいぢぎ:Ljava/lang/String;

.field public びぐびあび:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->びぐびあび:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->づざかべべ:Ljava/util/ArrayList;

    const-string v0, ""

    iput-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->なぎぱいぢぎ:Ljava/lang/String;

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->げつ〴ぬぐ:Landroid/content/Context;

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Landroid/app/Activity;

    check-cast p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/げつ〴ぬぐ;

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/util/ArrayList;Ljava/lang/String;I)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->びぐびあび:Ljava/util/ArrayList;

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->なぎぱいぢぎ:Ljava/lang/String;

    iput p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->ぁごぐすすぃ:I

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_5a

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v0, 0x0

    if-lez p2, :cond_57

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->づざかべべ:Ljava/util/ArrayList;

    const/4 p2, 0x0

    :goto_1b
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p2, v1, :cond_3b

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Landroid/app/Activity;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_38

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_38
    add-int/lit8 p2, p2, 0x1

    goto :goto_1b

    :cond_3b
    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_57

    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->〺つふすそ:Landroid/app/Activity;

    iget-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-static {p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/げつ〴ぬぐ;->びぐびあび(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_58

    :cond_57
    const/4 v0, 0x1

    :goto_58
    if-eqz v0, :cond_5f

    .line 2
    :cond_5a
    iget-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/くし〴〺ぅ;->くし〴〺ぅ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/げつ〴ぬぐ;

    invoke-interface {p1, p3}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/へぬ〴づぞ/げつ〴ぬぐ;->へぬ〴づぞ(I)V

    :cond_5f
    return-void
.end method
