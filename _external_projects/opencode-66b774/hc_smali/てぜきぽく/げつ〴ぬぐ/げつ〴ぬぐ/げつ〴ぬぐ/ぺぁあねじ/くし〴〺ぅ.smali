.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;
.super Landroidx/recyclerview/widget/RecyclerView$びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$\u3073\u3050\u3073\u3042\u3073<",
        "L\u3066\u305c\u304d\u307d\u304f/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u3052\u3064\u3034\u306c\u3050/\u307a\u3041\u3042\u306d\u3058/\u3073\u3050\u3073\u3042\u3073;",
        ">;"
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

.field public ぁごぐすすぃ:Landroid/view/View;

.field public くし〴〺ぅ:Landroid/content/Context;

.field public づざかべべ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lteam/dev/epro/apkcustom/models/VPNServer;",
            ">;"
        }
    .end annotation
.end field

.field public なぎぱいぢぎ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/てぜきぽく/〳ぜぞぜべっ;

.field public びぐびあび:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lteam/dev/epro/apkcustom/models/VPNServer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->づざかべべ:Ljava/util/List;

    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ$げつ〴ぬぐ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;)V

    iput-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->くし〴〺ぅ:Landroid/content/Context;

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->づざかべべ:Ljava/util/List;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->びぐびあび:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()I
    .registers 2

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->づざかべべ:Ljava/util/List;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    goto :goto_a

    :cond_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_a
    return v0
.end method

.method public づざかべべ(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;
    .registers 5

    .line 1
    iget-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->びぐびあび:Landroid/view/LayoutInflater;

    const v0, 0x7f0c0051

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->ぁごぐすすぃ:Landroid/view/View;

    new-instance p2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;

    invoke-direct {p2, p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public びぐびあび(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;I)V
    .registers 14

    check-cast p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;

    .line 1
    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->づざかべべ:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lteam/dev/epro/apkcustom/models/VPNServer;

    :try_start_a
    invoke-virtual {p2}, Lteam/dev/epro/apkcustom/models/VPNServer;->ぺふねづ〺()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_12
    .catch Ljava/lang/NumberFormatException; {:try_start_a .. :try_end_12} :catch_13

    goto :goto_15

    :catch_13
    const-wide/16 v0, 0x0

    :goto_15
    iget-object v2, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;->でどあくず:Landroid/widget/TextView;

    invoke-virtual {p2}, Lteam/dev/epro/apkcustom/models/VPNServer;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;->ぶでにく〼〳:Landroid/widget/TextView;

    invoke-virtual {p2}, Lteam/dev/epro/apkcustom/models/VPNServer;->ぺぁあねじ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;->〻ぞまぎな〻:Landroid/widget/TextView;

    const/16 v3, 0x400

    int-to-long v4, v3

    cmp-long v6, v0, v4

    if-gez v6, :cond_4a

    .line 2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "\u001cj9@giMefJf>Kbf\u001djjL1;\u001cc9Nag\u001bgm\u001b6"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_a1

    :cond_4a
    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    int-to-double v6, v3

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    div-double/2addr v4, v8

    double-to-int v3, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v5, v3, -0x1

    const-string v8, "H`;\u001eg<\u001d3fLjf\u0019jn@4nN1;\u001bgo\u0019anJ4<Hd"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v8, 0x0

    int-to-double v9, v3

    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    aput-object v0, v5, v8

    const/4 v0, 0x1

    aput-object v4, v5, v0

    const-string v0, "\u001af9\u001bjhK1>@7j\u001bkfMbjA79K4oK1iI0=\u001ba"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 3
    :goto_a1
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;->ぉ〲なぱぽた:Landroid/widget/TextView;

    invoke-virtual {p2}, Lteam/dev/epro/apkcustom/models/VPNServer;->いいにぽつ()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;->ざっざへづ:Landroid/widget/ImageView;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->くし〴〺ぅ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "@0;\u001e0:Ik;\u001dkgN6fI3j\u00194;\u0019f:@af@c>Jk"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lteam/dev/epro/apkcustom/models/VPNServer;->〳ぜぞぜべっ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->くし〴〺ぅ:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "MdhI`j\u0019ak\u001dbh\u0019am\u00190gK1=\u001b7f\u00190i\u001b1;\u00197"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, p2, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p2, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;->ごづごきえ:Landroidx/cardview/widget/CardView;

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->〳ぜぞぜべっ:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺぁあねじ/びぐびあび;->ごづごきえ:Landroidx/cardview/widget/CardView;

    invoke-virtual {p2, p1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    return-void
.end method
