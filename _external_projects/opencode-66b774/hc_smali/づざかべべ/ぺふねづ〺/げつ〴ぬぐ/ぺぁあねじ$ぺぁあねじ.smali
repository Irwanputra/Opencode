.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$〳ぜぞぜべっ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u307a\u3041\u3042\u306d\u3058"
.end annotation


# instance fields
.field public final 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

.field public final げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;Ljava/lang/String;II)V
    .registers 5

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;->げつ〴ぬぐ:I

    iput p4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;->〺つふすそ:I

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ごづごきえ:Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_16

    iget v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;->げつ〴ぬぐ:I

    if-gez v1, :cond_16

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->ぺぁあねじ()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object v0

    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;->びぐびあび()Z

    move-result v0

    if-eqz v0, :cond_16

    const/4 p1, 0x0

    return p1

    :cond_16
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    const/4 v3, 0x0

    iget v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;->げつ〴ぬぐ:I

    iget v5, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$ぺぁあねじ;->〺つふすそ:I

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぇいうげ〱〹(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z

    move-result p1

    return p1
.end method
