.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Ljava/util/ArrayList;

.field public final synthetic づざかべべ:Ljava/util/ArrayList;

.field public final synthetic なぎぱいぢぎ:Ljava/util/ArrayList;

.field public final synthetic びぐびあび:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぇ〳〲〺すっ;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .registers 7

    iput p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->〺つふすそ:I

    iput-object p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->くし〴〺ぅ:Ljava/util/ArrayList;

    iput-object p4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->びぐびあび:Ljava/util/ArrayList;

    iput-object p5, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->づざかべべ:Ljava/util/ArrayList;

    iput-object p6, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->〺つふすそ:I

    if-ge v0, v1, :cond_2e

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ごまけがぢは(Landroid/view/View;Ljava/lang/String;)V

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->づざかべべ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぶでにく〼〳;->なぎぱいぢぎ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ごまけがぢは(Landroid/view/View;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2e
    return-void
.end method
