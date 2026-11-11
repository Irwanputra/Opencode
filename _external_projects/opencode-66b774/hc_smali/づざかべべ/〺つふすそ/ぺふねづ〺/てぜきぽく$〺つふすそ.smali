.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget v1, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ごまけがぢは:I

    and-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    invoke-virtual {v0, v2}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->けときぜと(I)V

    :cond_c
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iget v1, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ごまけがぢは:I

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_19

    const/16 v1, 0x6c

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->けときぜと(I)V

    :cond_19
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;

    iput-boolean v2, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ばおぢでぎか:Z

    iput v2, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/てぜきぽく;->ごまけがぢは:I

    return-void
.end method
