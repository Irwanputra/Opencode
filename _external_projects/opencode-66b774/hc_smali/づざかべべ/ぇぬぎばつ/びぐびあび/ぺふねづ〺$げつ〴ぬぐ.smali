.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

.field public づざかべべ:I

.field public なぎぱいぢぎ:I

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;IIII)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iput-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    .line 2
    iput p3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->くし〴〺ぅ:I

    iput p4, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->びぐびあび:I

    iput p5, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->づざかべべ:I

    iput p6, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->なぎぱいぢぎ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, "ChangeInfo{oldHolder="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", newHolder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fromX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fromY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->びぐびあび:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", toX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->づざかべべ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", toY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$げつ〴ぬぐ;->なぎぱいぢぎ:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
