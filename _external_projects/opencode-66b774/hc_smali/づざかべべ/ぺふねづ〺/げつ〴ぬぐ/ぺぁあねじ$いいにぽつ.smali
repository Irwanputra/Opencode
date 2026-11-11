.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/fragment/app/Fragment$くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3044\u3044\u306b\u307d\u3064"
.end annotation


# instance fields
.field public final 〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;->げつ〴ぬぐ:Z

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 8

    iget v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;->くし〴〺ぅ:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_8

    const/4 v0, 0x1

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    iget-object v3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v3, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget-object v4, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_13
    if-ge v1, v4, :cond_24

    iget-object v5, v3, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/Fragment;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroidx/fragment/app/Fragment;->ぇいうげ〱〹(Landroidx/fragment/app/Fragment$くし〴〺ぅ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_13

    .line 1
    :cond_24
    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v3, v1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;->ぉざぅち〻:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget-boolean v4, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$いいにぽつ;->げつ〴ぬぐ:Z

    xor-int/2addr v0, v2

    invoke-virtual {v3, v1, v4, v0, v2}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->のぷのちつ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/げつ〴ぬぐ;ZZZ)V

    return-void
.end method
